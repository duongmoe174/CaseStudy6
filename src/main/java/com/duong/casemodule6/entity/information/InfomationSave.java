package com.duong.casemodule6.entity.information;

import com.duong.casemodule6.entity.house.House;
import com.duong.casemodule6.entity.status.StatusNotification;
import com.duong.casemodule6.entity.user.Guest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Profile;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "infomation_save")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfomationSave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private StatusNotification statusNotification;

    @OneToOne
    private House house;

    private Date createDay;

    private String path;

    @OneToOne
    private Guest guest;

    private boolean isActive;

    public InfomationSave(StatusNotification statusNotification, House house, Date createDay, String path, Guest guest, boolean isActive) {
        this.statusNotification = statusNotification;
        this.house = house;
        this.createDay = createDay;
        this.path = path;
        this.guest = guest;
        this.isActive = isActive;
    }
}
