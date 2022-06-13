package com.duong.casemodule6.repository;

import com.duong.casemodule6.entity.user.Guest;
import com.duong.casemodule6.entity.user.Host;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHostRepository extends JpaRepository<Host, Long> {
    Host findHostByAppUser_Id(Long id);
}
