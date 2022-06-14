package com.duong.casemodule6.controller;

import com.duong.casemodule6.entity.InformationSave;
import com.duong.casemodule6.service.informationSave.IInformationSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/infomationSave")
@CrossOrigin("*")
public class InformationSaveController {
    @Autowired
    private IInformationSaveService informationSaveService;
    @GetMapping("/active/{id}")
    public ResponseEntity<Iterable<InformationSave>> get10InformationSaveByIdUserActive(@PathVariable Long id){
        Iterable<InformationSave> informationSaves = informationSaveService.get10InformationSaveByIdUserActive(id);
        return new ResponseEntity<>(informationSaves, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Iterable<InformationSave>> getAllInformationSaveByIdUserIsActive (@PathVariable Long id) {
        Iterable<InformationSave> informationSaves = informationSaveService.get10InformationSaveByIdUserActive(id);
        return new ResponseEntity<>(informationSaves, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<InformationSave> changeActiveInformation(@RequestParam(name = "id") Long id) {
        Optional<InformationSave> informationSaveOptional = informationSaveService.findById(id);
        if (!informationSaveOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        informationSaveOptional.get().setActive(true);
        return new ResponseEntity<>(informationSaveService.save(informationSaveOptional.get()), HttpStatus.OK);
    }
}
