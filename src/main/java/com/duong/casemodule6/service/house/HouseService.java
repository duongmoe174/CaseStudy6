package com.duong.casemodule6.service.house;


import com.duong.casemodule6.entity.dto.nativequery.IAvailableForRentHouse;
import com.duong.casemodule6.entity.dto.nativequery.ITopFiveRank;
import com.duong.casemodule6.entity.house.House;
import com.duong.casemodule6.repository.IHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HouseService implements IHouseService{

    @Autowired
    private IHouseRepository houseRepository;

    @Override
    public Iterable<House> findAll() {
        return houseRepository.findAll();
    }

    @Override
    public Optional<House> findById(Long id) {
        return houseRepository.findById(id);
    }

    @Override
    public House save(House house) {
        return houseRepository.save(house);
    }

    @Override
    public void remove(Long id) {
        houseRepository.deleteById(id);
    }

    @Override
    public Iterable<IAvailableForRentHouse> getListAvailableForRentHouse() {
        return houseRepository.getListAvailableForRentHouse();
    }

    @Override
    public Iterable<House> random9House() {
        return houseRepository.random9House();
    }

    @Override
    public Iterable<House> getHomeListByFilter(String address, String bedroom, String bathroom, String price) {
        if (address == "") {
            address = "%%";
        }
        if (bedroom == "") {
            bedroom = "%%";
        }
        if (bathroom == "") {
            bathroom = "%%";
        }
        if (price == "") {
            price = "%%";
        }
        return houseRepository.getHomeListByFilter(address, bedroom, bathroom, price);
    }

    @Override
    public Iterable<ITopFiveRank> getListFiveRank() {
        return houseRepository.getListFiveRank();
    }

}
