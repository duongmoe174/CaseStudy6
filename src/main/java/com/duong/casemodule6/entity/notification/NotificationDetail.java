package com.duong.casemodule6.entity.notification;
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
@Table(name = "notification_detail")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class NotificationDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private House house;

    private Date createDay;

    private String content;

    @ManyToOne
    private Guest guest;

}
