package com.duong.casemodule6.entity;

import com.duong.casemodule6.entity.house.House;
import com.duong.casemodule6.entity.user.AppUser;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "notification_detail")
public class NotificationDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private StatusNotification statusNotification;
    @OneToOne
    private House house;
    private Date createDay;
    private String path;
    @OneToOne
    private AppUser user;

    public NotificationDetail(Long id, StatusNotification statusNotification, House house, Date createDay, String path, AppUser user) {
        this.id = id;
        this.statusNotification = statusNotification;
        this.house = house;
        this.createDay = createDay;
        this.path = path;
        this.user = user;
    }

    public NotificationDetail(StatusNotification statusNotification, House house, Date createDay, String path, AppUser user) {
        this.statusNotification = statusNotification;
        this.house = house;
        this.createDay = createDay;
        this.path = path;
        this.user = user;
    }

    public NotificationDetail() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StatusNotification getStatusNotification() {
        return statusNotification;
    }

    public void setStatusNotification(StatusNotification statusNotification) {
        this.statusNotification = statusNotification;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Date getCreateDay() {
        return createDay;
    }

    public void setCreateDay(Date createDay) {
        this.createDay = createDay;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }
}
