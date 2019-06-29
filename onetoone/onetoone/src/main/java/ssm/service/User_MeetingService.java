package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.User_MeetingMapper;
import ssm.pojo.User;
import ssm.pojo.User_Meeting;

@Service
public class User_MeetingService {
    @Autowired
    User_MeetingMapper user_meetingMapper;

    public User_Meeting selectByUserId(User user) {

        User_Meeting result=user_meetingMapper.selectByUserId(user);
        return result;
    }
}
