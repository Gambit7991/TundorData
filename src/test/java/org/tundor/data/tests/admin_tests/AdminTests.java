package org.tundor.data.tests.admin_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tundor.data.models.user_roles.Admin;

import static org.junit.jupiter.api.Assertions.*;

public class AdminTests extends AdminBase{
    private Admin admin;

    @BeforeEach
    public void setup() {
        admin = factory.generateUser();
    }

    @Test
    void createTutorTest() {
        assertTrue(flow.save(admin)
                .findById(admin.getId()).isPresent());
    }

    @Test
    void deleteTutorTest() {
        assertAll(
                () -> assertTrue(flow.save(admin).findById(admin.getId()).isPresent()),
                () -> assertNull(flow.deleteById(admin.getId()).findById(admin.getId()).orElse(null))
        );
    }

}
