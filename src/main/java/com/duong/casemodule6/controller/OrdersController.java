package com.duong.casemodule6.controller;

import com.duong.casemodule6.entity.NotificationDetail;
import com.duong.casemodule6.entity.StatusNotification;
import com.duong.casemodule6.entity.house.House;
import com.duong.casemodule6.entity.order.Orders;
import com.duong.casemodule6.entity.order.StatusOrder;
import com.duong.casemodule6.entity.user.AppUser;
import com.duong.casemodule6.service.appuser.IAppUserService;
import com.duong.casemodule6.service.house.IHouseService;
import com.duong.casemodule6.service.noficationDetail.INotificationDetailService;
import com.duong.casemodule6.service.orders.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private IOrdersService ordersService;
    @Autowired
    private INotificationDetailService notificationDetailService;
    @Autowired
    private IHouseService houseService;
    @Autowired
    private IAppUserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<Orders> findOrdersById(@PathVariable Long id) {
        Optional<Orders> ordersOptional = ordersService.findById(id);
        if (!ordersOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(ordersOptional.get(), HttpStatus.OK);
    }

    @GetMapping("/statusDone/house/{id}")
    public ResponseEntity<Iterable<Orders>> getAllOrderStatusDoneByIdHouse(@PathVariable Long id) {
        Iterable<Orders> orders = ordersService.getAllOrderStatusDoneByIdHouse(id);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Orders> save(@RequestBody Orders orders) {
        Optional<House> houseOptional = houseService.findById(orders.getHouse().getId());
        orders.setStatusOrder(new StatusOrder(1L));
        String path = "/admin/orders";
        Optional<AppUser> userOptional = userService.findById(orders.getUser().getId());
        NotificationDetail notificationDetail = new NotificationDetail(new StatusNotification(1L), houseOptional.get(), new Date(), path, userOptional.get());
        notificationDetailService.save(notificationDetail);
        return new ResponseEntity<>(ordersService.save(orders), HttpStatus.CREATED);
    }
}
