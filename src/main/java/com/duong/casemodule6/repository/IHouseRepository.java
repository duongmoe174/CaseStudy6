package com.duong.casemodule6.repository;

import com.duong.casemodule6.entity.house.House;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHouseRepository extends CrudRepository<House, Long> {
}
