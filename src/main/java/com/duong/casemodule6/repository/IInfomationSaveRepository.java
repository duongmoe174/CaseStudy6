package com.duong.casemodule6.repository;

import com.duong.casemodule6.entity.information.InfomationSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IInfomationSaveRepository extends JpaRepository<InfomationSave,Long> {
    @Query(value = "select * from infomation_save join houses h on h.id = infomation_save.house_id where h.user_id = ?1 and infomation_save.is_active order by create_day Desc limit 10", nativeQuery = true)
    Iterable<InfomationSave> get10InformationSaveByIdUserActive(Long id);


    @Query(value = "select * from infomation_save join houses h on h.id = infomation_save.house_id where h.user_id = ?1 and infomation_save.is_active = false order by create_day Desc limit 10", nativeQuery = true)
    Iterable<InfomationSave> getAllInformationSaveByIdUserIsActive(Long id);
}
