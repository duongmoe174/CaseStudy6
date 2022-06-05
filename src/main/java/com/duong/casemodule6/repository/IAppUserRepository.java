package com.duong.casemodule6.repository;

import com.duong.casemodule6.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByName(String name);

    Boolean existsByName(String name);

    Boolean existsByEmail(String email);

}
