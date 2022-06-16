package com.duong.casemodule6.service.host;

import com.duong.casemodule6.entity.dto.nativequery.IHistoryOfGuest;
import com.duong.casemodule6.entity.user.Host;
import com.duong.casemodule6.repository.IHostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class HostService implements IHostService{
    @Autowired
    private IHostRepository hostRepository;

    @Override
    public Iterable<Host> findAll() {
        return hostRepository.findAll();
    }

    @Override
    public Optional<Host> findById(Long id) {
        return hostRepository.findById(id);
    }

    @Override
    public Host save(Host host) {
        return hostRepository.save(host);
    }

    @Override
    public void remove(Long id) {
        hostRepository.deleteById(id);
    }

    @Override
    public Host findHostByAppUser_Id(Long id) {
        return hostRepository.findHostByAppUser_Id(id);
    }

    public IHistoryOfGuest getHistoryByGuestId(Long id){
        return hostRepository.getHistoryByGuestId(id);
    };
}
