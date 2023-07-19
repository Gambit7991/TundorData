package org.tundor_tests.data.tests.user_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tundor.data.DTOs.BaseUserDTO;
import org.tundor_tests.data.factories.BaseFactoryDTO;
import org.tundor_tests.data.flow.BaseFlow;
import org.tundor_tests.data.tests.BaseTest;

import java.util.UUID;

public abstract class UserTests<User extends BaseUserDTO> extends BaseTest {

    private User user;

    @BeforeEach
    public void setup(){
        user = getUser();
    }


    protected abstract User getUser();
    protected abstract BaseFlow<User, UUID> getFlow();
    protected abstract BaseFactoryDTO getFactory();


    @Test
    public void createUser(){
        getFlow().save(user);
        Assertions.assertEquals(user, getFlow().findById(user.getId()).orElse(null));
    }

}
