package org.tundor.data.data_interacting.services;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BaseService<T, ID>{
    JpaRepository<T, ID> getRepository();

    default List<T> findAll() {
        return getRepository().findAll();
    }

    default Optional<T> findById(ID id) {
        return getRepository().findById(id);
    }

    default Optional<T> save(T entity) {
        return Optional.of(getRepository().save(entity));
    }

    default void deleteById(ID id) {
        getRepository().deleteById(id);
    }
}
