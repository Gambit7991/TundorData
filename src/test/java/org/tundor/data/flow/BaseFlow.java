package org.tundor.data.flow;

import org.springframework.context.ApplicationContext;
import org.tundor.data.data_interacting.controllers.BaseController;
import org.tundor.data.models.BaseUser;

import java.util.Optional;
public abstract class BaseFlow<T extends BaseUser, UUID> {
    private final BaseController<T, UUID> controller;

    public BaseFlow(Class<? extends BaseController<T, UUID>> controllerClass, ApplicationContext context) {
        controller = context.getBean(controllerClass);
    }

    public BaseFlow<T, UUID> save(T user) {
        controller.save(user);
        return this;
    }

    public Optional<T> findById(UUID id) {
        return controller.findById(id);
    }

    public BaseFlow<T, UUID> deleteById(UUID id) {
        controller.deleteById(id);
        return this;
    }

}
