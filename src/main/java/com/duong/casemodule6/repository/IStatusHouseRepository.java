package com.duong.casemodule6.repository;

import com.duong.casemodule6.entity.status.StatusHouse;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStatusHouseRepository extends PagingAndSortingRepository<StatusHouse, Long> {

}
