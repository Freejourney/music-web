package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.Specialist_MeetingMapper;
import ssm.pojo.Specialist;
import ssm.pojo.Specialist_Meeting;

@Service
public class Specialist_MeetingService {
    @Autowired
    Specialist_MeetingMapper specialist_meetingMapper;

    public Specialist_Meeting selectBySpecialistId(Specialist specialist){
        Specialist_Meeting result=specialist_meetingMapper.selectBySpecialistId(specialist);
        return result;
    }

}
