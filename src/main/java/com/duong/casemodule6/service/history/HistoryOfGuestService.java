//package com.duong.casemodule6.service.history;
//
//import com.duong.casemodule6.entity.dto.nativequery.IHistoryOfGuest;
//import com.duong.casemodule6.repository.IHistoryOfGuestRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class HistoryOfGuestService implements IHistoryOfGuestService{
//
//    @Autowired
//    private IHistoryOfGuestRepository historyOfGuestRepository;
//    @Override
//    public Iterable<IHistoryOfGuest> findAll() {
//        return null;
//    }
//
//    @Override
//    public Optional<IHistoryOfGuest> findById(Long id) {
//        return Optional.empty();
//    }
//
//    @Override
//    public IHistoryOfGuest save(IHistoryOfGuest iHistoryOfGuest) {
//        return null;
//    }
//
//    @Override
//    public void remove(Long id) {
//        historyOfGuestRepository.deleteById(id);
//    }
//
//    @Override
//    public IHistoryOfGuest getHistoryByGuestId(Long id) {
//        return historyOfGuestRepository.getHistoryByGuestId(id);
//    }
//}
