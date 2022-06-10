package com.duong.casemodule6.repository;

import com.duong.casemodule6.entity.user.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGuestRepository extends JpaRepository<Guest, Long> {
    Guest findGuestByAppUser_Id(Long id);
}
