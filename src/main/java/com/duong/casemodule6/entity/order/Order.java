package com.duong.casemodule6.entity.order;

import com.duong.casemodule6.entity.house.House;
import com.duong.casemodule6.entity.user.Guest;
import com.duong.casemodule6.entity.user.Host;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Guest guest;

    @ManyToOne
    private Host host;

    @ManyToOne
    private House house;

    private LocalDateTime bookingDate;
    private LocalDate checkinDate;
    private LocalDate checkoutDate;

    public Order() {
    }

    public Order(Guest guest, Host host, House house, LocalDateTime bookingDate, LocalDate checkinDate, LocalDate checkoutDate) {
        this.guest = guest;
        this.host = host;
        this.house = house;
        this.bookingDate = bookingDate;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    public Order(Long id, Guest guest, Host host, House house, LocalDateTime bookingDate, LocalDate checkinDate, LocalDate checkoutDate) {
        this.id = id;
        this.guest = guest;
        this.host = host;
        this.house = house;
        this.bookingDate = bookingDate;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public LocalDate getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(LocalDate checkinDate) {
        this.checkinDate = checkinDate;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }
}
