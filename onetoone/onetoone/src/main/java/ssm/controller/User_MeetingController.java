package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.pojo.User;
import ssm.pojo.User_Meeting;
import ssm.service.User_MeetingService;

@Controller
public class User_MeetingController {
    @Autowired
    User_MeetingService user_meetingService;

    @RequestMapping("selectByUserId.action")
    public String selectByUserId(User user, Model model){
        User_Meeting simpleResult=user_meetingService.selectByUserId(user);


        model.addAttribute("simpleResult",simpleResult);
        return "index";
    }
}
