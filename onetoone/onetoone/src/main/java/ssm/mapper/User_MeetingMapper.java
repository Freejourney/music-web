package ssm.mapper;

import ssm.pojo.User;
import ssm.pojo.User_Meeting;

public interface User_MeetingMapper {
    User_Meeting selectByUserId(User user);
}
