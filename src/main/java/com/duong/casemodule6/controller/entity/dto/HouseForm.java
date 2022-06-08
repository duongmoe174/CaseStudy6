package com.duong.casemodule6.controller.entity.dto;

import com.duong.casemodule6.controller.entity.house.Room;
import com.duong.casemodule6.controller.entity.user.Host;
import org.springframework.web.multipart.MultipartFile;


import java.util.Set;

public class HouseForm {
    private Long id;
    private String name;
    private Set<Room> room_category;
    private int numberOfBedroom;
    private int numberOfBathroom;
    private String description;
    private double price;
    private MultipartFile image;
    private Boolean status;
    private Host host;

    public HouseForm() {
    }

    public HouseForm(Long id, String name, Set<Room> room_category, int numberOfBedroom, int numberOfBathroom, String description, double price, MultipartFile image, Boolean status, Host host) {
        this.id = id;
        this.name = name;
        this.room_category = room_category;
        this.numberOfBedroom = numberOfBedroom;
        this.numberOfBathroom = numberOfBathroom;
        this.description = description;
        this.price = price;
        this.image = image;
        this.status = status;
        this.host = host;
    }

    public HouseForm(String name, Set<Room> room_category, int numberOfBedroom, int numberOfBathroom, String description, double price, MultipartFile image, Boolean status, Host host) {
        this.name = name;
        this.room_category = room_category;
        this.numberOfBedroom = numberOfBedroom;
        this.numberOfBathroom = numberOfBathroom;
        this.description = description;
        this.price = price;
        this.image = image;
        this.status = status;
        this.host = host;
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

    public int getNumberOfBedroom() {
        return numberOfBedroom;
    }

    public void setNumberOfBedroom(int numberOfBedroom) {
        this.numberOfBedroom = numberOfBedroom;
    }

    public int getNumberOfBathroom() {
        return numberOfBathroom;
    }

    public void setNumberOfBathroom(int numberOfBathroom) {
        this.numberOfBathroom = numberOfBathroom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }
}
