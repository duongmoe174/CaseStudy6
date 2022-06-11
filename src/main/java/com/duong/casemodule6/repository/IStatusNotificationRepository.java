package com.duong.casemodule6.repository;

import com.duong.casemodule6.entity.status.StatusNotification;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IStatusNotificationRepository extends PagingAndSortingRepository<StatusNotification,Long> {
}
