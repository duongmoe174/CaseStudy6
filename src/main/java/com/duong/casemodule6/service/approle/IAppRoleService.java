package com.duong.casemodule6.service.approle;

import com.duong.casemodule6.entity.role.AppRole;
import com.duong.casemodule6.service.IGerneralService;

import java.util.Optional;

public interface IAppRoleService extends IGerneralService<AppRole> {
    Optional<AppRole> findByName(String name);
}
