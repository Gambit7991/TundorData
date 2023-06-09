package org.tundor.data.data_interacting.controllers;

import org.springframework.web.bind.annotation.*;
import org.tundor.data.data_interacting.services.BaseService;
import org.tundor.data.models.BaseUser;

import java.util.List;
import java.util.Optional;

public abstract class BaseController <User extends BaseUser, UUID>{
    private final BaseService<User, UUID> service;

    public BaseController(BaseService<User, UUID> service) {
        this.service = service;
    }

    @GetMapping
    public List<User> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @PostMapping
    public Optional<User> save(@RequestBody User user) {
        return service.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }

    @PutMapping("/{id}")
    public Optional<User> update(@PathVariable UUID id, @RequestBody User user){
        return service.update(id, user);
    }
}
