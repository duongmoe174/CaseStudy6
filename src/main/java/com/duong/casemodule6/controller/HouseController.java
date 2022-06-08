package com.duong.casemodule6.controller;

import com.duong.casemodule6.service.room.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/house")
@CrossOrigin("*")
public class HouseController {

    @Autowired
    private IRoomService roomService;

}
