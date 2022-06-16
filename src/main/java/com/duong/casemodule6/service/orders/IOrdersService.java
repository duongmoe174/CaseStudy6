package com.duong.casemodule6.service.orders;

import com.duong.casemodule6.entity.order.Orders;
import com.duong.casemodule6.service.IGerneralService;
import org.springframework.data.jpa.repository.Query;

public interface IOrdersService extends IGerneralService<Orders> {
    Iterable<Orders> getAllOrderStatusDoneByIdHouse(Long house_id);

    Iterable<Orders> find5OrderByOrderIdRent(Long user_id);

    Iterable<Orders> findAllOrderProcessingByUserId(Long user_id);

    Iterable<Orders> findAllOrderProcessingByHouseId(Long house_id);
}
