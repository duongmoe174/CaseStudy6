package com.duong.casemodule6.controller;

import com.duong.casemodule6.entity.order.Order;
import com.duong.casemodule6.service.order.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private IOrderService orderService;

    @GetMapping
    public ResponseEntity<Iterable<Order>> getAllOrder() {
        Iterable<Order> Orders = orderService.findAll();
        return new ResponseEntity<>(Orders, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findOrderById(@PathVariable Long id) {
        Order Order = orderService.findById(id).get();
        return new ResponseEntity<>(Order, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order Order) {
        return new ResponseEntity<>(orderService.save(Order), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable Long id, @RequestBody Order newOrder) {
        Optional<Order> OrderOptional = orderService.findById(id);
        if (!OrderOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        newOrder.setId(id);
        return new ResponseEntity<>(orderService.save(newOrder), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Order> deleteOrder(@PathVariable Long id) {
        Optional<Order> OrderOptional = orderService.findById(id);
        if (!OrderOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        orderService.remove(id);
        return new ResponseEntity<>(OrderOptional.get(), HttpStatus.OK);
    }

}
