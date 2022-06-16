package com.duong.casemodule6.controller;

import com.duong.casemodule6.entity.dto.nativequery.IHistoryOfGuest;
import com.duong.casemodule6.service.host.IHostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/histories")
@CrossOrigin("*")
public class HistoryController {
    @Autowired
    private IHostService hostService;

    @GetMapping("/{guestId}")
    public ResponseEntity<IHistoryOfGuest> getHistoryOfGuestById(@PathVariable Long guestId) {
        return new ResponseEntity<>(hostService.getHistoryByGuestId(guestId), HttpStatus.OK);
    }

  @DeleteMapping("/{guestId}")
  public ResponseEntity<IHistoryOfGuest> deleteHistory(@PathVariable Long guestId) {
      hostService.remove(guestId);
      return new ResponseEntity<>(HttpStatus.OK);
   }
}
