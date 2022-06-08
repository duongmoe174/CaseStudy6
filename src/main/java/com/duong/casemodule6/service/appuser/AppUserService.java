package com.duong.casemodule6.service.appuser;

import com.duong.casemodule6.entity.user.AppUser;
import com.duong.casemodule6.entity.dto.UserPrinciple;
import com.duong.casemodule6.repository.IAppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AppUserService implements IAppUserService{
    @Autowired
    private IAppUserRepository appUserRepository;

    @Override
    public Iterable<AppUser> findAll() {
        return appUserRepository.findAll();
    }

    @Override
    public Optional<AppUser> findById(Long id) {
        return appUserRepository.findById(id);
    }

    @Override
    public AppUser save(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    @Override
    public void remove(Long id) {
        appUserRepository.deleteById(id);
    }

    @Override
    public AppUser findByName(String name) {
        return appUserRepository.findByName(name).get();
    }

    @Override
    public Boolean existsByName(String name) {
        return appUserRepository.existsByName(name);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return appUserRepository.existsByEmail(email);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> userOptional = appUserRepository.findByName(username);
        if (userOptional.isPresent()){
            return UserPrinciple.build(userOptional.get());
        }
        return null;
    }
}
