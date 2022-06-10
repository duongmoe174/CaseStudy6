package com.duong.casemodule6.controller;

import com.duong.casemodule6.entity.user.Host;
import com.duong.casemodule6.service.host.IHostService;
import com.duong.casemodule6.entity.dto.HouseForm;
import com.duong.casemodule6.entity.house.House;
import com.duong.casemodule6.entity.house.Room;

import com.duong.casemodule6.service.house.IHouseService;
import com.duong.casemodule6.service.room.IRoomService;
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
@RequestMapping("/houses")
@CrossOrigin("*")
public class HouseController {

    @Autowired
    private IRoomService roomService;

    @Autowired
    private IHouseService houseService;

    @Autowired
    Environment env;

    @Autowired
    private IHostService hostService;


    @ModelAttribute("rooms")
    private Iterable<Room> rooms(){
        return roomService.findAll();
    }

    @GetMapping("/room")
    public ResponseEntity<Iterable<Room>> showAllRoom(){
        return new ResponseEntity<>(roomService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<Iterable<House>> showAllHouse(){
        return new ResponseEntity<>(houseService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<House> createHouse(@ModelAttribute HouseForm houseForm){
        MultipartFile multipartFile = houseForm.getImage();
        String fileName = multipartFile.getOriginalFilename();
        String fileUpLoad = env.getProperty("upload.path").toString();
        String name = houseForm.getName();
        Set<Room> room_category = houseForm.getRoom_category();
        String address = houseForm.getAddress();
        String numberOfBedroom = houseForm.getNumberOfBedroom();
        String numberOfBathroom = houseForm.getNumberOfBathroom();
        String description = houseForm.getDescription();
        String price = houseForm.getPrice();
        Boolean status = houseForm.getStatus();
        Host host = houseForm.getHost();
        try{
            FileCopyUtils.copy(multipartFile.getBytes(), new File(fileUpLoad+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        House house = new House(name,room_category,address,numberOfBedroom,numberOfBathroom,description,price,fileName,status,host);
        houseService.save(house);
        return new ResponseEntity<>(house, HttpStatus.CREATED);
    }

    @PostMapping("/{id}")
    public ResponseEntity<House> editHouse(@PathVariable Long id, @ModelAttribute HouseForm houseForm){
        Optional<House> houseOptional = houseService.findById(id);
        if (!houseOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            MultipartFile multipartFile = houseForm.getImage();
            String fileName = multipartFile.getOriginalFilename();
            String fileUpLoad = env.getProperty("upload.path").toString();
            String name = houseForm.getName();
            Set<Room> room_category = houseForm.getRoom_category();
            String address = houseForm.getAddress();
            String numberOfBedroom = houseForm.getNumberOfBedroom();
            String numberOfBathroom = houseForm.getNumberOfBathroom();
            String description = houseForm.getDescription();
            String price = houseForm.getPrice();
            Boolean status = houseForm.getStatus();
            Host host = houseForm.getHost();
            try{
                FileCopyUtils.copy(houseForm.getImage().getBytes(), new File(fileUpLoad+fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            House house = new House(name,room_category,address,numberOfBedroom,numberOfBathroom,description,price,fileName,status,host);
            house.setId(id);
            houseService.save(house);
            return new ResponseEntity<>(house, HttpStatus.OK);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<House> deleteHouse (@PathVariable Long id){
        Optional<House> houseOptional = houseService.findById(id);
        if (!houseOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        houseService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<House> findOne(@PathVariable Long id){
        Optional<House> houseOptional = houseService.findById(id);
        if (!houseOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(houseOptional.get(), HttpStatus.OK);
    }

    @GetMapping("/hosts/{id}")
    public ResponseEntity<Host> getHostById(@PathVariable Long id){
        Optional<Host> hostOptional = hostService.findById(id);
        if (!hostOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(hostOptional.get(), HttpStatus.OK);
    }



}
