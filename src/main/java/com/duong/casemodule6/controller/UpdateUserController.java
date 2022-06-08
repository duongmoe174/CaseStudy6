package com.duong.casemodule6.controller;

import com.duong.casemodule6.entity.dto.GuestForm;
import com.duong.casemodule6.entity.dto.HostForm;
import com.duong.casemodule6.entity.role.AppRole;
import com.duong.casemodule6.entity.user.AppUser;
import com.duong.casemodule6.entity.user.Guest;
import com.duong.casemodule6.entity.user.Host;
import com.duong.casemodule6.service.appuser.IAppUserService;
import com.duong.casemodule6.service.guest.IGuestService;
import com.duong.casemodule6.service.host.IHostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/profile")
public class UpdateUserController {
    @Autowired
    private IAppUserService appUserService;
    @Autowired
    private Environment environment;
    @Autowired
    private IGuestService guestService;

    @Autowired
    private IHostService hostService;

    @GetMapping("/guest/{id}")
    public ResponseEntity<Guest> getGuestById (@PathVariable Long id) {
        Optional<Guest> guestOptional = guestService.findById(id);
        if (!guestOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(guestOptional.get(), HttpStatus.OK);
    }

    @PostMapping("/guest/edit/{id}")
    public ResponseEntity<Guest> editGuest (@PathVariable Long id, @ModelAttribute GuestForm guestForm) {
        Optional<Guest> guestOptional = guestService.findById(id);
        if (!guestOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        MultipartFile file = guestForm.getImage();
        String fileName = file.getOriginalFilename();
        String fileUpload = environment.getProperty("upload.path");
        try {
            FileCopyUtils.copy(guestForm.getImage().getBytes(), new File(fileUpload + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Long idAppUser = guestOptional.get().getAppUser().getId();
        String username = guestOptional.get().getAppUser().getName();
        String email = guestForm.getEmail();
        String password = guestOptional.get().getAppUser().getPassword();
        String fullName = guestForm.getFullName();
        String address = guestForm.getAddress();
        String phone = guestForm.getPhone();
        Set<AppRole> role = guestOptional.get().getAppUser().getRoleSet();
        AppUser editAppUser = new AppUser(username, email, password, role);
        editAppUser.setId(idAppUser);
        appUserService.save(editAppUser);
        Guest editGuest = new Guest(fullName, fileName, address, phone, editAppUser);
        editGuest.setId(id);
        guestService.save(editGuest);
        return new ResponseEntity<>(editGuest, HttpStatus.OK);
    }

    @GetMapping("/host/{id}")
    public ResponseEntity<Host> getHostById (@PathVariable Long id) {
        Optional<Host> hostOptional = hostService.findById(id);
        if (!hostOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(hostOptional.get(), HttpStatus.OK);
    }

    @PostMapping("/host/edit/{id}")
    public ResponseEntity<Host> editHost (@PathVariable Long id, @ModelAttribute HostForm hostForm) {
        Optional<Host> hostOptional = hostService.findById(id);
        if (!hostOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        MultipartFile file = hostForm.getImage();
        String fileName = file.getOriginalFilename();
        String fileUpload = environment.getProperty("upload.path");
        try {
            FileCopyUtils.copy(hostForm.getImage().getBytes(), new File(fileUpload + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Long idAppUser = hostOptional.get().getAppUser().getId();
        String username = hostOptional.get().getAppUser().getName();
        String email = hostForm.getEmail();
        String password = hostOptional.get().getAppUser().getPassword();
        String fullName = hostForm.getFullName();
        String address = hostForm.getAddress();
        String phone = hostForm.getPhone();
        Set<AppRole> role = hostOptional.get().getAppUser().getRoleSet();
        AppUser editAppUser = new AppUser(username, email, password, role);
        editAppUser.setId(idAppUser);
        appUserService.save(editAppUser);
        Host editHost = new Host(fullName, fileName, address, phone, editAppUser);
        editHost.setId(id);
        hostService.save(editHost);
        return new ResponseEntity<>(editHost, HttpStatus.OK);
    }
}
