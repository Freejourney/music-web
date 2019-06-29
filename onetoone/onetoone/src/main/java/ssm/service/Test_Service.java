package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.TestMapper;
import ssm.pojo.test;

@Service
public class Test_Service {
    @Autowired
    TestMapper test_service;

    public String selectByID(int id) {
        String results = test_service.selectByID(id);
        return results+"fea";
    }
}
