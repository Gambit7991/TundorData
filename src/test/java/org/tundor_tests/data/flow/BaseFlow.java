package org.tundor_tests.data.flow;

import org.domain.models.Account;
import org.springframework.context.ApplicationContext;
import org.tundor.data.DTOs.BaseUserDTO;
import org.tundor.data.data_interacting.repositories.BaseRepository;

import java.util.Optional;
import java.util.UUID;

public abstract class BaseFlow<T extends BaseUserDTO, ID> {
    public final BaseRepository<T> repository;

    public BaseFlow(Class<? extends BaseRepository<T>> controllerClass, ApplicationContext context) {
        repository = context.getBean(controllerClass);
    }

    public BaseFlow<T, ID> save(T user) {
        repository.save(user);
        return this;
    }

    public Optional<T> findById(UUID id) {
        return repository.findById(id);
    }

    public BaseFlow<T, ID> deleteById(UUID id) {
        repository.deleteById(id);
        return this;
    }

    public abstract Optional<Account> findByIdDomainModel(UUID id);

//    public BaseFlow<T, UUID> updateById(UUID id, T user){
//        repository.update(id, user);
//        return this;
//    }

}
