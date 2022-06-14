package com.duong.casemodule6.entity.house;

import com.duong.casemodule6.entity.user.AppUser;
import com.duong.casemodule6.entity.user.Host;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "houses")
public class House {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    private Room room_category;
    private String address;
    private String numberOfBedroom;
    private String numberOfBathroom;
    private String description;
    private String price;
    private String image;
    @OneToOne
    private Status status;
    @OneToOne
    private AppUser user;
    private int count;

    public House() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom_category() {
        return room_category;
    }

    public void setRoom_category(Room room_category) {
        this.room_category = room_category;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberOfBedroom() {
        return numberOfBedroom;
    }

    public void setNumberOfBedroom(String numberOfBedroom) {
        this.numberOfBedroom = numberOfBedroom;
    }

    public String getNumberOfBathroom() {
        return numberOfBathroom;
    }

    public void setNumberOfBathroom(String numberOfBathroom) {
        this.numberOfBathroom = numberOfBathroom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public House(String name, Room room_category, String address, String numberOfBedroom, String numberOfBathroom, String description, String price, String image, Status status, AppUser user) {
        this.name = name;
        this.room_category = room_category;
        this.address = address;
        this.numberOfBedroom = numberOfBedroom;
        this.numberOfBathroom = numberOfBathroom;
        this.description = description;
        this.price = price;
        this.image = image;
        this.status = status;
        this.user = user;
    }

    public House(String name, Room room_category, String address, String numberOfBedroom, String numberOfBathroom, String description, String price, String image, Status status, AppUser user, int count) {
        this.name = name;
        this.room_category = room_category;
        this.address = address;
        this.numberOfBedroom = numberOfBedroom;
        this.numberOfBathroom = numberOfBathroom;
        this.description = description;
        this.price = price;
        this.image = image;
        this.status = status;
        this.user = user;
        this.count = count;
    }

    public House(Long id, String name, Room room_category, String address, String numberOfBedroom, String numberOfBathroom, String description, String price, String image, Status status, AppUser user, int count) {
        this.id = id;
        this.name = name;
        this.room_category = room_category;
        this.address = address;
        this.numberOfBedroom = numberOfBedroom;
        this.numberOfBathroom = numberOfBathroom;
        this.description = description;
        this.price = price;
        this.image = image;
        this.status = status;
        this.user = user;
        this.count = count;
    }
}
