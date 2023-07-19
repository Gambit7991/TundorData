package org.tundor_tests.data.tests.user_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tundor.data.DTOs.BaseUserDTO;
import org.tundor_tests.data.factories.BaseFactoryDTO;
import org.tundor_tests.data.flow.BaseFlow;
import org.tundor_tests.data.tests.BaseTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class UserTests<User extends BaseUserDTO> extends BaseTest {

    public User user;

    @BeforeEach
    public void setup(){
        user = getUser();
    }

    protected abstract User getUser();
    protected abstract BaseFlow<User, UUID> getFlow();
    protected abstract BaseFactoryDTO getFactory();
    protected abstract String getClassType();



    @Test
    public void createUserTest(){
        getFlow().save(user);
        System.out.println(user.getId());
        Assertions.assertEquals(user, getFlow().findById(user.getId()).orElse(null));
    }

    @Test
    public void toDomainTest() {
        getFlow().save(user);
        assertEquals(getFlow().findByIdDomainModule(user.getId()).isPresent() ?
                getFlow().findByIdDomainModule(user.getId()).get().getClass().getTypeName() : null, getClassType());
    }

}
