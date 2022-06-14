package com.duong.casemodule6.entity.order;

import com.duong.casemodule6.entity.house.House;
import com.duong.casemodule6.entity.user.AppUser;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private AppUser user;
    @ManyToOne
    private House house;
    private Date checkIn;
    private Date checkOut;
    @OneToOne
    private StatusOrder statusOrder;
    private boolean statusCheckIn;
}
