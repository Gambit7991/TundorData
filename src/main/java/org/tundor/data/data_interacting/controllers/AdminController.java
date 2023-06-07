package org.tundor.data.data_interacting.controllers;

import org.springframework.web.bind.annotation.*;
import org.tundor.data.data_interacting.services.AdminService;
import org.tundor.data.models.user_roles.Admin;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/Admin")
public class AdminController {
    private final AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }


    @GetMapping
    public List<Admin> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Admin> findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @PostMapping
    public Optional<Admin> save(@RequestBody Admin admin) {
        return service.save(admin);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }

}
