package com.duong.casemodule6.entity.dto;

public class StatusHouseForm {
    private Long id;
    private String name;

    public StatusHouseForm() {
    }

    public StatusHouseForm(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public StatusHouseForm(String name) {
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
