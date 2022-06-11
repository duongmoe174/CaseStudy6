package com.duong.casemodule6.service.notificationdetail;

import com.duong.casemodule6.entity.notification.NotificationDetail;
import com.duong.casemodule6.service.IGerneralService;

public interface INotificationDetailService extends IGerneralService<NotificationDetail> {
    Iterable<NotificationDetail> getAllNotificationDetailByIdUser(Long id);
}
