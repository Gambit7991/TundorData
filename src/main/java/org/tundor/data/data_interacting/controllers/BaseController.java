package org.tundor.data.data_interacting.controllers;

import org.springframework.web.bind.annotation.*;
import org.tundor.data.data_interacting.services.BaseService;

import java.util.List;
import java.util.Optional;

public abstract class BaseController <BaseUser, UUID>{
    private final BaseService<BaseUser, UUID> service;

    public BaseController(BaseService<BaseUser, UUID> service) {
        this.service = service;
    }

    @GetMapping
    public List<BaseUser> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<BaseUser> findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @PostMapping
    public Optional<BaseUser> save(@RequestBody BaseUser user) {
        return service.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }

}
