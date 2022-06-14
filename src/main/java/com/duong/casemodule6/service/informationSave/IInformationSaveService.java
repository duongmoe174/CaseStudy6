package com.duong.casemodule6.service.informationSave;

import com.duong.casemodule6.entity.InformationSave;
import com.duong.casemodule6.service.IGerneralService;

public interface IInformationSaveService extends IGerneralService<InformationSave> {
    Iterable<InformationSave> get10InformationSaveByIdUserActive(Long id);

    Iterable<InformationSave> getAllInformationSaveByIdUserIsActive(Long id);
}
