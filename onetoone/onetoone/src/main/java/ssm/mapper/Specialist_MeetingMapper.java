package ssm.mapper;

import ssm.pojo.Specialist;
import ssm.pojo.Specialist_Meeting;

public interface Specialist_MeetingMapper {
    public Specialist_Meeting selectBySpecialistId(Specialist specialist);
}
