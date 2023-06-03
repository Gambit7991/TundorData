package org.tundor.data.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tundor.data.models.UserInfo;
import org.tundor.data.repositories.UserInfoRep;

import java.util.List;

@Service
public class UserInfoService {
    private final UserInfoRep userInfoRep;

    @Autowired
    public UserInfoService(UserInfoRep userInfoRep) {
        this.userInfoRep = userInfoRep;
    }

    public List<UserInfo> getAllUsers() {
        return userInfoRep.findAll();
    }

    public UserInfo getUserById(Long id) {
        return userInfoRep.findById(id).orElse(null);
    }

    public UserInfo saveUser(UserInfo userDTO) {
        return userInfoRep.save(userDTO);
    }

    public void deleteUser(Long id) {
        userInfoRep.deleteById(id);
    }
}