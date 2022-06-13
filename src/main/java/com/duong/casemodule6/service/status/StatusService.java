package com.duong.casemodule6.service.status;

import com.duong.casemodule6.entity.house.Status;
import com.duong.casemodule6.repository.IStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StatusService implements IStatusService{

    @Autowired
    private IStatusRepository statusRepository;

    @Override
    public Iterable<Status> findAll() {
        return statusRepository.findAll();
    }

    @Override
    public Optional<Status> findById(Long id) {
        return statusRepository.findById(id);
    }

    @Override
    public Status save(Status status) {
        return statusRepository.save(status);
    }

    @Override
    public void remove(Long id) {
        statusRepository.deleteById(id);
    }
}