package com.duong.casemodule6.controller;

import com.duong.casemodule6.controller.entity.dto.HouseForm;
import com.duong.casemodule6.controller.entity.house.House;
import com.duong.casemodule6.controller.entity.house.Room;

import com.duong.casemodule6.service.house.IHouseService;
import com.duong.casemodule6.service.room.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/house")
@CrossOrigin("*")
public class HouseController {

    @Autowired
    private IRoomService roomService;

    @Autowired
    private IHouseService houseService;

    @Autowired
    Environment env;

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

    }



}
