package com.duong.casemodule6.entity.rate;

import com.duong.casemodule6.entity.house.House;
import com.duong.casemodule6.entity.user.AppUser;

import javax.persistence.*;

@Entity
@Table(name = "rates")
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int star;

    @OneToOne
    private AppUser user;

    @ManyToOne
    private House house;

    public Rate() {
    }

    public Rate(int star, AppUser user, House house) {
        this.star = star;
        this.user = user;
        this.house = house;
    }

    public Rate(Long id, int star, AppUser user, House house) {
        this.id = id;
        this.star = star;
        this.user = user;
        this.house = house;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
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
}
