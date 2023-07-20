package org.tundor_tests.data.tests.user_tests.tutor;

import org.domain.models.userRoles.Tutor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.tundor.data.DTOs.user_roles.TutorDTO;
import org.tundor.data.mappers.TutorMapper;
import org.tundor_tests.data.factories.BaseFactoryDTO;
import org.tundor_tests.data.factories.user_DTO_factories.TutorFactoryDTO;
import org.tundor_tests.data.flow.BaseFlow;
import org.tundor_tests.data.flow.user_flow.TutorFlow;
import org.tundor_tests.data.tests.user_tests.UserTests;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Transactional
public class TutorTests extends UserTests<TutorDTO> {

    private static TutorFlow flow;
    private static TutorFactoryDTO factory;

    @BeforeAll
    public static void init() {
        flow = new TutorFlow(context);
        factory = new TutorFactoryDTO();
    }

    @Override
    protected TutorDTO getUser() {
        return factory.generateUser();
    }

    @Override
    protected BaseFlow<TutorDTO, UUID> getFlow() {
        return flow;
    }

    @Override
    protected BaseFactoryDTO getFactory() {
        return factory;
    }

    @Override
    protected String getClassType() {
        return Tutor.class.getTypeName();
    }

    @Test
    public void userToDomain() {
        Tutor tutor = TutorMapper.INSTANCE.toDomain(getUser());
        assertNotNull(tutor);
    }

    @Test
    public void userToDTO() {
        getFlow().save(user);
        Tutor us = (Tutor) flow.findByIdDomainModel(user.getId()).orElse(null);
        System.out.println(us);

        TutorDTO fin = TutorMapper.INSTANCE.toDTO(us);
        System.out.println(fin);
        assertNotNull(fin);
    }


}
