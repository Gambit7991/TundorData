package org.tundor.data.controllers;


import org.springframework.web.bind.annotation.*;
import org.tundor.data.models.UserInfo;
import org.tundor.data.services.UserInfoService;

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
    public UserInfo getProductById(@PathVariable Long id) {
        return userInfoService.getUserById(id);
    }

    @PostMapping
    public UserInfo createProduct(@RequestBody UserInfo product) {
        return userInfoService.saveUser(product);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userInfoService.deleteUser(id);
    }
}
