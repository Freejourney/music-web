package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.pojo.Specialist;
import ssm.pojo.Specialist_Meeting;
import ssm.service.Specialist_MeetingService;

@Controller
public class Specialist_MeetingController {
    @Autowired
    Specialist_MeetingService specialist_meetingService;

    @RequestMapping("selectBySpecialistId.action")
    public String selectBySpecialistId(Specialist specialist, Model model){
        Specialist_Meeting result=specialist_meetingService.selectBySpecialistId(specialist);

        model.addAttribute("Result",result);
        return "index";
    }
}
