package com.duong.casemodule6.controller;

import com.duong.casemodule6.entity.rate.Rate;
import com.duong.casemodule6.service.rate.IRateServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rates")
@CrossOrigin("*")
public class RateController {
    @Autowired
    private IRateServive rateServive;

    @GetMapping("/{houseId}")
    public ResponseEntity<Iterable<Rate>>  getAllRateByHouseId(@PathVariable Long houseId) {
        Iterable<Rate> rates = rateServive.findAll();
        return new ResponseEntity<>(rates, HttpStatus.OK);
    }

    @GetMapping("/average/{house_id}")
    public ResponseEntity getAverageRate(@PathVariable Long house_id) {
        return new ResponseEntity<>(rateServive.showAverageRateByHouseId(house_id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Rate> createNewRate(@RequestBody Rate rate) {
        return new ResponseEntity<>(rateServive.save(rate), HttpStatus.OK);
    }


}
