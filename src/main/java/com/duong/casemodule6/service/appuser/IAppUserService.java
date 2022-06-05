package com.duong.casemodule6.service.appuser;

import com.duong.casemodule6.model.AppUser;
import com.duong.casemodule6.service.IGerneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IAppUserService extends IGerneralService<AppUser>, UserDetailsService {
    AppUser findByName(String name);
    Boolean existsByName(String name);
}
