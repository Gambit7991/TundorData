package org.tundor.data.data_interacting.services.info_services;


import org.springframework.stereotype.Service;
import org.tundor.data.data_interacting.repositories.info_repositories.UserInfoRepository;
import org.tundor.data.models.UserInfo;

import java.util.List;
import java.util.Optional;

@Service
public class UserInfoService {
    private final UserInfoRepository repository;

    public UserInfoService(UserInfoRepository repository) {
        this.repository = repository;
    }

    public List<UserInfo> findAll() {
        return repository.findAll();
    }

    public Optional<UserInfo> findById(Long id) {
        return repository.findById(id);
    }

    public Optional<UserInfo> save(UserInfo user) {
        return Optional.of(repository.save(user));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}