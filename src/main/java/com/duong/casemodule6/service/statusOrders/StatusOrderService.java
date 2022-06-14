package com.duong.casemodule6.service.statusOrders;

import com.duong.casemodule6.entity.order.StatusOrder;
import com.duong.casemodule6.repository.IStatusOrdersRepository;
import com.duong.casemodule6.repository.IStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StatusOrderService implements IStatusOrdersService {

    @Autowired
    private IStatusOrdersRepository statusOrdersRepository;

    @Override
    public Iterable<StatusOrder> findAll() {
        return statusOrdersRepository.findAll();
    }

    @Override
    public Optional<StatusOrder> findById(Long id) {
        return statusOrdersRepository.findById(id);
    }

    @Override
    public StatusOrder save(StatusOrder statusOrder) {
        return statusOrdersRepository.save(statusOrder);
    }

    @Override
    public void remove(Long id) {
        statusOrdersRepository.deleteById(id);
    }
}
