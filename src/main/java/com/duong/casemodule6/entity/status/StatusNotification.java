package com.duong.casemodule6.entity.status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "status_notification")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusNotification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public StatusNotification(Long id) {
        this.id = id;
    }

}
