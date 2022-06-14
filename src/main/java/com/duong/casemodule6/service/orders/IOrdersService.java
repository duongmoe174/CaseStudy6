package com.duong.casemodule6.service.orders;

import com.duong.casemodule6.entity.order.Orders;
import com.duong.casemodule6.service.IGerneralService;
import org.springframework.data.jpa.repository.Query;

public interface IOrdersService extends IGerneralService<Orders> {
    Iterable<Orders> getAllOrderStatusDoneByIdHouse(Long house_id);

}
