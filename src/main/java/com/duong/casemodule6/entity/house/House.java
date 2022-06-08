package com.duong.casemodule6.entity.house;

import com.duong.casemodule6.entity.user.Host;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "house")
public class House {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable (name = "house_room", joinColumns = {@JoinColumn(name="house_id")},
    inverseJoinColumns = {@JoinColumn(name = "room_id")})
    private Set<Room> room_category;
    private String address;
    private int numberOfBedroom;
    private int numberOfBathroom;
    private String description;
    private double price;
    private String image;
    private Boolean status;
    @ManyToOne
    private Host host;

    public House() {
    }

    public House(Long id, String name, Set<Room> room_category, String address, int numberOfBedroom, int numberOfBathroom, String description, double price, String image, Boolean status, Host host) {
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

    public House(String name, Set<Room> room_category, String address, int numberOfBedroom, int numberOfBathroom, String description, double price, String image, Boolean status, Host host) {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
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
