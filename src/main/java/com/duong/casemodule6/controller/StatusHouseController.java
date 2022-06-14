package com.duong.casemodule6.controller;

import com.duong.casemodule6.entity.house.Status;
import com.duong.casemodule6.service.status.IStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/statusHouses")
public class StatusHouseController {
    @Autowired
    private IStatusService statusService;

    @GetMapping
    public ResponseEntity<Iterable<Status>> getAllStatusHouse() {
        Iterable<Status> statuses = statusService.findAll();
        return  new ResponseEntity<>(statuses, HttpStatus.OK);
    }
}
