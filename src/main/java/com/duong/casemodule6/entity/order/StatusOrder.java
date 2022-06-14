package com.duong.casemodule6.entity.order;

import javax.persistence.*;

@Entity
@Table(name = "status_orders")
public class StatusOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public StatusOrder(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public StatusOrder(String name) {
        this.name = name;
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
}
