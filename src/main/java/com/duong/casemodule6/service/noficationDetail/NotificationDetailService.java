package com.duong.casemodule6.service.noficationDetail;

import com.duong.casemodule6.entity.NotificationDetail;
import com.duong.casemodule6.repository.INotificationDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationDetailService implements INotificationDetailService {
    @Autowired
    private INotificationDetailRepository notificationDetailRepository;
    @Override
    public Iterable<NotificationDetail> findAll() {
        return notificationDetailRepository.findAll();
    }

    @Override
    public Optional<NotificationDetail> findById(Long id) {
        return notificationDetailRepository.findById(id);
    }

    @Override
    public NotificationDetail save(NotificationDetail notificationDetail) {
        return notificationDetailRepository.save(notificationDetail);
    }

    @Override
    public void remove(Long id) {
        notificationDetailRepository.deleteById(id);
    }

    @Override
    public Iterable<NotificationDetail> getAllNotificationDetailByIdUser(Long id) {
        return notificationDetailRepository.getAllNotificationDetailByIdUser(id);
    }
}
