package com.duong.casemodule6.service.informationSave;

import com.duong.casemodule6.entity.InformationSave;
import com.duong.casemodule6.repository.IInformationSaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InformationSaveService implements IInformationSaveService{
    @Autowired
    private IInformationSaveRepository informationSaveRepository;


    @Override
    public Iterable<InformationSave> findAll() {
        return informationSaveRepository.findAll();
    }

    @Override
    public Optional<InformationSave> findById(Long id) {
        return informationSaveRepository.findById(id);
    }

    @Override
    public InformationSave save(InformationSave informationSave) {
        return informationSaveRepository.save(informationSave);
    }

    @Override
    public void remove(Long id) {
        informationSaveRepository.deleteById(id);
    }
}
