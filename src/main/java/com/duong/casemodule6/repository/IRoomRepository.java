package com.duong.casemodule6.repository;

import com.duong.casemodule6.controller.entity.house.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoomRepository extends CrudRepository<Room, Long> {
}
