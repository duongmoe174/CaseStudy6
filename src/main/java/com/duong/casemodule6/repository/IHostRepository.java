package com.duong.casemodule6.repository;

import com.duong.casemodule6.entity.dto.nativequery.IHistoryOfGuest;
import com.duong.casemodule6.entity.user.Guest;
import com.duong.casemodule6.entity.user.Host;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IHostRepository extends JpaRepository<Host, Long> {
    Host findHostByAppUser_Id(Long id);
    @Query(value = "select a.id as id, full_name as full , name, address, a.booking_date as booking, a.checkin_date as checkin, a.checkout_date as checkout from\n" +
            "            (select  a.id, full_name, a.booking_date, a.checkin_date, a.checkout_date, house_id from (select * from orders where guest_id = ?) a join guest b on a.guest_id = b.id)\n" +
            "            a join house on a.house_id = house.id order by checkout_date desc", nativeQuery = true)
    IHistoryOfGuest getHistoryByGuestId(Long id);
}
