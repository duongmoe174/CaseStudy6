package com.duong.casemodule6.controller;

import com.duong.casemodule6.entity.InformationSave;
import com.duong.casemodule6.service.informationSave.IInformationSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/informationSave")
@CrossOrigin("*")
public class InformationSaveController {
    @Autowired
    private IInformationSaveService informationSaveService;
    @GetMapping("/active/{id}")
    public ResponseEntity<Iterable<InformationSave>> get10InformationSaveByIdUserActive(@PathVariable Long id) {
        Iterable<InformationSave> notificationSaves = informationSaveService.get10InformationSaveByIdUserActive(id);
        return new ResponseEntity<>(notificationSaves, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Iterable<InformationSave>> getAllInformationSaveByIdUserIsActive(@PathVariable Long id) {
        Iterable<InformationSave> notificationSaves = informationSaveService.getAllInformationSaveByIdUserIsActive(id);
        return new ResponseEntity<>(notificationSaves, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<InformationSave> changeActiveInfomation(@RequestParam(name = "id") Long id) {
        Optional<InformationSave> infomationSaveOptional = informationSaveService.findById(id);
        if (!infomationSaveOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        infomationSaveOptional.get().setActive(true);
        return new ResponseEntity<>(informationSaveService.save(infomationSaveOptional.get()), HttpStatus.OK);
    }
}
