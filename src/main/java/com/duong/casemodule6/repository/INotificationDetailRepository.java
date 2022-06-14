package com.duong.casemodule6.repository;

import com.duong.casemodule6.entity.NotificationDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INotificationDetailRepository extends JpaRepository<NotificationDetail, Long> {

}
