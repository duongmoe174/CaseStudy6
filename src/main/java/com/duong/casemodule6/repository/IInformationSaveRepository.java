package com.duong.casemodule6.repository;

import com.duong.casemodule6.entity.InformationSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInformationSaveRepository extends JpaRepository<InformationSave, Long> {
}
