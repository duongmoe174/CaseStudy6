package com.duong.casemodule6.service.guest;

import com.duong.casemodule6.entity.user.Guest;
import com.duong.casemodule6.service.IGerneralService;

public interface IGuestService extends IGerneralService<Guest> {
    Guest findGuestByAppUser_Id(Long id);
}
