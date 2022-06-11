package com.duong.casemodule6.controller;

import com.duong.casemodule6.entity.notification.NotificationDetail;
import com.duong.casemodule6.service.notificationdetail.INotificationDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/notificationDetail")
public class NotificationDetailController {
    @Autowired
    private INotificationDetailService notificationDetailService;

    @GetMapping("/{id}")
    public ResponseEntity<Iterable<NotificationDetail>> getAllNotificationDetailByIdUser(@PathVariable Long id) {
        Iterable<NotificationDetail> notificationDetails = notificationDetailService.getAllNotificationDetailByIdUser(id);
        return new ResponseEntity<>(notificationDetails, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<NotificationDetail> saveNotification(@RequestBody NotificationDetail notificationDetail) {
        if (notificationDetail.getHouse().getStatus()) {
            notificationDetail.setContent("vừa hủy phòng");
        } else {
            notificationDetail.setContent("vừa đặt phòng");
        }
        return new ResponseEntity<>(notificationDetailService.save(notificationDetail), HttpStatus.CREATED);
    }
}
