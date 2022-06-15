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

    @Query(nativeQuery = true, value = "select *from house where status_id = 1 order by RAND() limit 9")
    Iterable<House> random9House();
}
