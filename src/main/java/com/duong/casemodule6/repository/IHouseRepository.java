package com.duong.casemodule6.repository;

import com.duong.casemodule6.entity.dto.nativequery.IAvailableForRentHouse;
import com.duong.casemodule6.entity.house.House;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHouseRepository extends CrudRepository<House, Long> {

    @Query(nativeQuery = true, value = "select name,price,image,address from house where status = false")
    Iterable<IAvailableForRentHouse> getListAvailableForRentHouse();

    @Query(value = "call search_house(?1,?2,?3,?4)", nativeQuery = true)
    Iterable<House> search9House(String address, String bedroom, String bathroom, String price);
}
