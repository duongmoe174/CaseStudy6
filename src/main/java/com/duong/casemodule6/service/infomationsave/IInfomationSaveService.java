package com.duong.casemodule6.service.infomationsave;

import com.duong.casemodule6.entity.information.InfomationSave;
import com.duong.casemodule6.service.IGerneralService;

public interface IInfomationSaveService extends IGerneralService<InfomationSave> {
    Iterable<InfomationSave> get10InformationSaveByIdUserActive(Long id);

    Iterable<InfomationSave> getAllInformationSaveByIdUserIsActive(Long id);
}
