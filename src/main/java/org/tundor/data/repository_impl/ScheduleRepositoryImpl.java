package org.tundor.data.repository_impl;


import org.domain.models.User;
import org.domain.models.userRoles.Student;
import org.domain.models.userRoles.Tutor;
import org.domain.repositories.ScheduleFlowRepository;
import org.joda.time.Interval;

public class ScheduleRepositoryImpl implements ScheduleFlowRepository {

    @Override
    public boolean isIntervalAvailable(Tutor domainTutorModel, Student domainStudentModel, Interval interval) {
        return false;
    }

    @Override
    public boolean isIntervalAvailable(User userModel, Interval interval) {
        return false;
    }

    @Override
    public ScheduleFlowRepository setSchedule(Tutor domainTutorModel, Student domainStudentModel, Interval interval) {
        return null;
    }
}
