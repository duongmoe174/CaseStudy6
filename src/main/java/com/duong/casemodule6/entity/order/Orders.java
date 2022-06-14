package com.duong.casemodule6.entity.order;

import com.duong.casemodule6.entity.house.House;
import com.duong.casemodule6.entity.user.AppUser;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private AppUser user;
    @ManyToOne
    private House house;
    private Date checkIn;
    private Date checkOut;
    @OneToOne
    private StatusOrder statusOrder;
    private boolean statusCheckIn;

    public Orders() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(StatusOrder statusOrder) {
        this.statusOrder = statusOrder;
    }

    public boolean isStatusCheckIn() {
        return statusCheckIn;
    }

    public void setStatusCheckIn(boolean statusCheckIn) {
        this.statusCheckIn = statusCheckIn;
    }

    public Orders(AppUser user, House house, Date checkIn, Date checkOut, StatusOrder statusOrder, boolean statusCheckIn) {
        this.user = user;
        this.house = house;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.statusOrder = statusOrder;
        this.statusCheckIn = statusCheckIn;
    }

    public Orders(Long id, AppUser user, House house, Date checkIn, Date checkOut, StatusOrder statusOrder, boolean statusCheckIn) {
        this.id = id;
        this.user = user;
        this.house = house;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.statusOrder = statusOrder;
        this.statusCheckIn = statusCheckIn;
    }
}
