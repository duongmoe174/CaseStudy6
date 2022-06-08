package com.duong.casemodule6.entity.dto;
import com.duong.casemodule6.entity.role.AppRole;
import org.springframework.web.multipart.MultipartFile;

import java.util.Set;


public class GuestForm {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String fullName;
    private MultipartFile image;
    private String address;
    private String phone;

    private Set<AppRole> roles;

    public GuestForm() {
    }


    public GuestForm(Long id, String username, String email, String password, String fullName, MultipartFile image, String address, String phone, Set<AppRole> roles) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.image = image;
        this.address = address;
        this.phone = phone;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public Set<AppRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<AppRole> roles) {
        this.roles = roles;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

