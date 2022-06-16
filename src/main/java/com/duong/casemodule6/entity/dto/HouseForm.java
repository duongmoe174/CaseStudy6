package com.duong.casemodule6.entity.dto;

import com.duong.casemodule6.entity.house.Room;
import com.duong.casemodule6.entity.house.Status;
import com.duong.casemodule6.entity.user.AppUser;
import com.duong.casemodule6.entity.user.Host;
import org.springframework.web.multipart.MultipartFile;


import java.util.List;
import java.util.Set;

public class HouseForm {
    private Long id;
    private String name;
    private Room room_category;
    private String address;
    private String numberOfBedroom;
    private String numberOfBathroom;
    private String description;
    private String price;
    private MultipartFile image;
    private Status status;

    private Host host;
    private AppUser user;

    public HouseForm() {
    }

    public Long getId() {
        return id;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
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

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
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

    public HouseForm(String name, Room room_category, String address, String numberOfBedroom, String numberOfBathroom, String description, String price, MultipartFile image, Status status, AppUser user) {
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

    public HouseForm(Long id, String name, Room room_category, String address, String numberOfBedroom, String numberOfBathroom, String description, String price, MultipartFile image, Status status, AppUser user) {
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
    }
}
