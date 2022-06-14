package com.duong.casemodule6.entity.comment;

import com.duong.casemodule6.entity.house.House;
import com.duong.casemodule6.entity.user.AppUser;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 5000)
    private String text;

    @ManyToOne
    private AppUser user;

    @ManyToOne
    private House house;

    private Date createTime;

    private Long countLike;

    private Long countDislike;

    public Comment() {
    }

    public Comment(String text, AppUser user, House house, Date createTime, Long countLike, Long countDislike) {
        this.text = text;
        this.user = user;
        this.house = house;
        this.createTime = createTime;
        this.countLike = countLike;
        this.countDislike = countDislike;
    }

    public Comment(Long id, String text, AppUser user, House house, Date createTime, Long countLike, Long countDislike) {
        this.id = id;
        this.text = text;
        this.user = user;
        this.house = house;
        this.createTime = createTime;
        this.countLike = countLike;
        this.countDislike = countDislike;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCountLike() {
        return countLike;
    }

    public void setCountLike(Long countLike) {
        this.countLike = countLike;
    }

    public Long getCountDislike() {
        return countDislike;
    }

    public void setCountDislike(Long countDislike) {
        this.countDislike = countDislike;
    }
}
