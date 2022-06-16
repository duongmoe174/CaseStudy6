package com.duong.casemodule6.controller;

import com.duong.casemodule6.entity.InformationSave;
import com.duong.casemodule6.entity.NotificationDetail;
import com.duong.casemodule6.service.informationSave.InformationSaveService;
import com.duong.casemodule6.service.noficationDetail.INotificationDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/notificationDetail")
@RestController
@CrossOrigin("*")
public class NotificationDetailController {
    @Autowired
    private INotificationDetailService notificationDetailService;

    @Autowired
    private InformationSaveService informationSaveService;

    @GetMapping("/{id}")
    public ResponseEntity<Iterable<NotificationDetail>> getByIdUser(@PathVariable Long id) {
        Iterable<NotificationDetail> notificationDetails = notificationDetailService.getAllNotificationDetailByIdUser(id);
        return new ResponseEntity<>(notificationDetails, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Iterable<NotificationDetail>> deleteAllNotificationDetailByIdUser(@PathVariable Long id) {
        Iterable<NotificationDetail> notificationDetails = notificationDetailService.getAllNotificationDetailByIdUser(id);
        for (NotificationDetail notification : notificationDetails) {
            InformationSave informationSave = new InformationSave(notification.getStatusNotification(), notification.getHouse(), notification.getCreateDay(), notification.getPath(), notification.getUser(), false);
            informationSaveService.save(informationSave);
            notificationDetailService.remove(notification.getId());
        }
        return new ResponseEntity<>(notificationDetails, HttpStatus.OK);
    }

}
