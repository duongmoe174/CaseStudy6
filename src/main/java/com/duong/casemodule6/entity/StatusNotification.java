package com.duong.casemodule6.entity;

import javax.persistence.*;

@Entity
@Table(name = "status_notification")
public class StatusNotification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public StatusNotification() {
    }

    public StatusNotification(String name) {
        this.name = name;
    }

    public StatusNotification(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
