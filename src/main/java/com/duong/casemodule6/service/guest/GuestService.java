package com.duong.casemodule6.service.guest;

import com.duong.casemodule6.controller.entity.user.Guest;
import com.duong.casemodule6.repository.IGuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GuestService implements IGuestService {
    @Autowired
    private IGuestRepository guestRepository;

    @Override
    public Iterable<Guest> findAll() {
        return guestRepository.findAll();
    }

    @Override
    public Optional<Guest> findById(Long id) {
        return guestRepository.findById(id);
    }

    @Override
    public Guest save(Guest guest) {
        return guestRepository.save(guest);
    }

    @Override
    public void remove(Long id) {
        guestRepository.deleteById(id);
    }
}
