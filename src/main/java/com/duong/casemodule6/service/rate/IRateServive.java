package com.duong.casemodule6.service.rate;

import com.duong.casemodule6.entity.dto.nativequery.IGetRateList;
import com.duong.casemodule6.entity.rate.Rate;
import com.duong.casemodule6.service.IGerneralService;

public interface IRateServive extends IGerneralService<Rate> {
    double showAverageRateByHouseId(Long houseId);
    Iterable<IGetRateList> getAllRateByHouseId(Long id);
}
