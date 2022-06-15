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
        String path = "/host/orders";
        Optional<AppUser> userOptional = userService.findById(orders.getUser().getId());
        NotificationDetail notificationDetail = new NotificationDetail(new StatusNotification(1L), houseOptional.get(), new Date(), path, userOptional.get());
        notificationDetailService.save(notificationDetail);
        return new ResponseEntity<>(ordersService.save(orders), HttpStatus.CREATED);
    }

    @GetMapping("/historyOrderTop5/{id}")
    public ResponseEntity<Iterable<Orders>> find5OrderByOrderIdRent(@PathVariable Long id) {
        Iterable<Orders> orders = ordersService.find5OrderByOrderIdRent(id);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
    @GetMapping("/changeStatusCheckin/{id}")
    public ResponseEntity<Orders> changeStatusCheckinOrder(@PathVariable Long id) {
        Optional<Orders> orderOptional = ordersService.findById(id);
        orderOptional.get().setStatusCheckIn(true);
        ordersService.save(orderOptional.get());
        return new ResponseEntity<>(orderOptional.get(), HttpStatus.OK);
    }

    @GetMapping("/customerChangeStatusCanceled/{id}") //Dùng khi khách hàng hủy đơn ( tạo thông báo)
    public ResponseEntity<Orders> customerChangeStatusOrderCanceled(@PathVariable Long id) {
        Optional<Orders> orderOptional = ordersService.findById(id);
        if (!orderOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        String path = "/host/history";
        NotificationDetail notificationDetail = new NotificationDetail(new StatusNotification(2L), orderOptional.get().getHouse(), new Date(), path, orderOptional.get().getUser());
        notificationDetailService.save(notificationDetail);
        orderOptional.get().setStatusOrder(new StatusOrder(3L));
        return new ResponseEntity<>(ordersService.save(orderOptional.get()), HttpStatus.OK);
    }
}
