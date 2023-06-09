package org.tundor.data.data_interacting.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tundor.data.models.BaseUser;

import java.util.List;
import java.util.Optional;

public interface BaseService<User extends BaseUser, ID>{
    JpaRepository<User, ID> getRepository();

    default List<User> findAll() {
        return getRepository().findAll();
    }

    default Optional<User> findById(ID id) {
        return getRepository().findById(id);
    }

    default Optional<User> save(User user) {
        return Optional.of(getRepository().save(user));
    }

    default void deleteById(ID id) {
        getRepository().deleteById(id);
    }

    default Optional<User> update(ID id, User user){
        Optional<User> retrievedUser = findById(id);
        retrievedUser.ifPresent(el-> el.setInfo(user.getInfo()));
        return retrievedUser.flatMap(this::save);
    }
}
