package org.tundor.data.tests.user_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.tundor.data.factories.BaseFactory;
import org.tundor.data.flow.BaseFlow;
import org.tundor.data.models.BaseUser;
import org.tundor.data.tests.BaseTest;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@Execution(ExecutionMode.CONCURRENT)
public abstract class UserTests<User extends BaseUser> extends BaseTest {
    private User user;

    @BeforeEach
    public void setup() {
        user = createUser();
        createUserInDB();
    }

    protected abstract User createUser();

    protected abstract BaseFlow<User, UUID> flow();
    protected abstract BaseFactory factory();

    private BaseFlow<User, UUID> createUserInDB(User user) {
        return flow().save(user);
    }

    private BaseFlow<User, UUID> createUserInDB() {
        return flow().save(user);
    }

    @Test
    public void createUserTest() {
        assertTrue(createUserInDB(user).findById(user.getId()).isPresent());
    }

    @Test
    public void deleteUserTest() {
        assertNull(flow().deleteById(user.getId()).findById(user.getId()).orElse(null));
    }

    @Test
    public void updateUserTest() {
        flow().findById(user.getId()).ifPresent(el -> {
            el.getInfo().setAddress(factory().getSecondAddress());
            flow().updateById(user.getId(), el);
        });
        Optional<User> retrieveUser = flow().findById(user.getId());
        assertAll(() -> {
            assertTrue(retrieveUser.isPresent());
            assertNotEquals(user, retrieveUser.get());
            assertNotEquals(user.getInfo().getAddress(), retrieveUser.get().getInfo().getAddress());
        });
    }
}
