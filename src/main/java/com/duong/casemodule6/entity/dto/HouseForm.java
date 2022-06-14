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
    private Set<Room> room_category;
    private String address;
    private String numberOfBedroom;
    private String numberOfBathroom;
    private String description;
    private String price;
    private MultipartFile image;
    private Status status;
    private AppUser host;

    public HouseForm() {
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

    public Set<Room> getRoom_category() {
        return room_category;
    }

    public void setRoom_category(Set<Room> room_category) {
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

    public AppUser getHost() {
        return host;
    }

    public void setHost(AppUser host) {
        this.host = host;
    }

    public HouseForm(String name, Set<Room> room_category, String address, String numberOfBedroom, String numberOfBathroom, String description, String price, MultipartFile image, Status status, AppUser host) {
        this.name = name;
        this.room_category = room_category;
        this.address = address;
        this.numberOfBedroom = numberOfBedroom;
        this.numberOfBathroom = numberOfBathroom;
        this.description = description;
        this.price = price;
        this.image = image;
        this.status = status;
        this.host = host;
    }

    public HouseForm(Long id, String name, Set<Room> room_category, String address, String numberOfBedroom, String numberOfBathroom, String description, String price, MultipartFile image, Status status, AppUser host) {
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
        this.host = host;
    }
}
