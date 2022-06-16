package com.duong.casemodule6.service.host;

import com.duong.casemodule6.entity.dto.nativequery.IHistoryOfGuest;
import com.duong.casemodule6.entity.user.Host;
import com.duong.casemodule6.service.IGerneralService;

public interface IHostService extends IGerneralService<Host> {
    Host findHostByAppUser_Id(Long id);
    IHistoryOfGuest getHistoryByGuestId(Long id);
}
