package com.duong.casemodule6.service.rate;

import com.duong.casemodule6.entity.dto.nativequery.IGetRateList;
import com.duong.casemodule6.entity.rate.Rate;
import com.duong.casemodule6.repository.IRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RateService implements IRateServive{
    @Autowired
    private IRateRepository rateRepository;

    @Override
    public Iterable<Rate> findAll() {
        return rateRepository.findAll();
    }

    @Override
    public Optional<Rate> findById(Long id) {
        return rateRepository.findById(id);
    }

    @Override
    public Rate save(Rate rate) {
        return rateRepository.save(rate);
    }

    @Override
    public void remove(Long id) {
        rateRepository.deleteById(id);
    }

    @Override
    public double showAverageRateByHouseId(Long houseId) {
        return rateRepository.showAverageRateByHouseId(houseId);
    }

    @Override
    public Iterable<IGetRateList> getAllRateByHouseId(Long id) {
        return rateRepository.getAllRateByHouseId(id);
    }

}
