package com.duong.casemodule6.service.noficationDetail;

import com.duong.casemodule6.entity.NotificationDetail;
import com.duong.casemodule6.service.IGerneralService;

public interface INotificationDetailService extends IGerneralService<NotificationDetail> {
    Iterable<NotificationDetail> getAllNotificationDetailByIdUser(Long id);
}
