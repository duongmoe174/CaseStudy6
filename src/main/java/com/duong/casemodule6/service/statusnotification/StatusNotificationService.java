package com.duong.casemodule6.service.statusnotification;

import com.duong.casemodule6.entity.status.StatusNotification;
import com.duong.casemodule6.repository.IStatusNotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StatusNotificationService implements IStatusNotificationService {

    @Autowired
    private IStatusNotificationRepository statusNotificationRepository;


    @Override
    public Iterable<StatusNotification> findAll() {
        return statusNotificationRepository.findAll();
    }

    @Override
    public Optional<StatusNotification> findById(Long id) {
        return statusNotificationRepository.findById(id);
    }

    @Override
    public StatusNotification save(StatusNotification statusNotification) {
        return statusNotificationRepository.save(statusNotification);
    }

    @Override
    public void remove(Long id) {
        statusNotificationRepository.deleteById(id);
    }
}