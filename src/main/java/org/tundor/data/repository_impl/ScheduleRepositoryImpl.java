package org.tundor.data.repository_impl;


import org.domain.models.DomainUserModel;
import org.domain.models.userRoles.DomainStudentModel;
import org.domain.models.userRoles.DomainTutorModel;
import org.domain.repositories.ScheduleFlowRepository;
import org.joda.time.Interval;

public class ScheduleRepositoryImpl implements ScheduleFlowRepository {
    @Override
    public boolean isIntervalAvailable(DomainTutorModel domainTutorModel, DomainStudentModel domainStudentModel, Interval interval) {
        return false;
    }

    @Override
    public boolean isIntervalAvailable(DomainUserModel domainUserModel, Interval interval) {
        return false;
    }

    @Override
    public ScheduleFlowRepository setSchedule(DomainTutorModel domainTutorModel, DomainStudentModel domainStudentModel, Interval interval) {
        return null;
    }
}
