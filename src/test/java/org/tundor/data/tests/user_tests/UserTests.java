package org.tundor.data.tests.user_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.tundor.data.tests.BaseTest;
import org.tundor.data.flow.BaseFlow;
import org.tundor.data.models.BaseUser;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Execution(ExecutionMode.CONCURRENT)
public abstract class UserTests<UserType extends BaseUser> extends BaseTest {
    private UserType user;
    @BeforeEach
    public void setup() {
        user = createUser();
    }

    protected abstract UserType createUser();

    protected abstract BaseFlow<UserType, UUID> getFlow();

    private BaseFlow<UserType, UUID> createUserInDB(UserType userType){
        return getFlow().save(userType);
    }

    private BaseFlow<UserType, UUID> createUserInDB(){
        return getFlow().save(user);
    }

    @Test
    public void createUserTest() {
        assertTrue(createUserInDB(user).findById(user.getId()).isPresent());
    }

    @Test
    public void deleteUserTest() {
        createUserInDB();
        assertNull(getFlow().deleteById(user.getId()).findById(user.getId()).orElse(null));
    }
}
