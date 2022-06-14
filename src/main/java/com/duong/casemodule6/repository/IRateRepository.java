package com.duong.casemodule6.repository;

import com.duong.casemodule6.entity.dto.nativequery.IGetRateList;
import com.duong.casemodule6.entity.rate.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IRateRepository extends JpaRepository<Rate, Long>{

    @Query(value = "SELECT avg(rates.star) FROM rates WHERE house_id = ?1", nativeQuery = true)
    double showAverageRateByHouseId(Long houseId);

    @Query(value = "select a.id, a.star, b.id, b.name from (select * from rates where house_id = ?1) a join appuser b on a.user_id = b.id order by star desc", nativeQuery = true)
    Iterable<IGetRateList> getAllRateByHouseId(Long houseId);
}
