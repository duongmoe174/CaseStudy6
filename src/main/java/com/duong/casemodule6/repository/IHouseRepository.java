package com.duong.casemodule6.repository;

import com.duong.casemodule6.entity.dto.nativequery.IAvailableForRentHouse;
import com.duong.casemodule6.entity.dto.nativequery.ITopFiveRank;
import com.duong.casemodule6.entity.house.House;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHouseRepository extends CrudRepository<House, Long> {

    @Query(nativeQuery = true, value = "select name,price,image,address from house where status_id = 1")
    Iterable<IAvailableForRentHouse> getListAvailableForRentHouse();

    @Query(value = "call search_house(?1,?2,?3,?4)", nativeQuery = true)
    Iterable<House> getHomeListByFilter(String address, String bedroom, String bathroom, String price);

    @Query(value = "SELECT id, name, address, count FROM house ORDER BY count DESC limit 5", nativeQuery = true)
    Iterable<ITopFiveRank> getListFiveRank();
}
