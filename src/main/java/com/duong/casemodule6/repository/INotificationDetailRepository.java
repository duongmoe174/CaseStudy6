package com.duong.casemodule6.repository;

import com.duong.casemodule6.entity.notification.NotificationDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface INotificationDetailRepository extends JpaRepository<NotificationDetail, Long> {
    @Query(value = "select * from notification_detail join houses h on notification_detail.house_id = h.id where h.user_id =?1 order by create_day DESC", nativeQuery = true)
    Iterable<NotificationDetail> getAllNotificationDetailByIdUser(Long id);

}
