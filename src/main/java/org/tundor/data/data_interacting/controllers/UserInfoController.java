package org.tundor.data.data_interacting.controllers;


import org.springframework.web.bind.annotation.*;
import org.tundor.data.models.UserInfo;
import org.tundor.data.data_interacting.services.UserInfoService;

import java.util.List;

@RestController
@RequestMapping("/UserInfoEntity")
public class UserInfoController {
    private final UserInfoService userInfoService;

    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @GetMapping
    public List<UserInfo> getAllUserInfo() {
        return userInfoService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserInfo getUserInfoById(@PathVariable Long id) {
        return userInfoService.getUserById(id);
    }

    @PostMapping
    public UserInfo createUserInfo(@RequestBody UserInfo userInfo) {
        return userInfoService.saveUser(userInfo);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userInfoService.deleteUser(id);
    }
}
