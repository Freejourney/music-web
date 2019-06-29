package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ssm.pojo.Admin;
import ssm.pojo.User;
import ssm.service.Test_Service;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("Test")
public class TestController {

    // todo http://localhost:8080/main_war_exploded/Test/baseType1.do?age=111111
    @RequestMapping(value = "baseType1.do")
    @ResponseBody
    public String baseType1(int age) {
        return "age: "+age;
    }

    // todo http://localhost:8080/main_war_exploded/Test/baseType2.do?age=111111
    @RequestMapping(value = "baseType2.do")
    @ResponseBody
    public String baseType2(Integer age) {
        return "IntegerAge: "+age;
    }

    // todo http://localhost:8080/main_war_exploded/Test/array.do?name=123&name=fagegae&name=jaoiejgae123
    @RequestMapping("array.do")
    @ResponseBody
    /**
     * @ResponseBody是作用在方法上的，@ResponseBody 表示该方法的返回结果直接写入 HTTP response body 中，
     * 一般在异步获取数据时使用【也就是AJAX】，在使用 @RequestMapping后，返回值通常解析为跳转路径，但是加上
     * @ResponseBody 后返回结果不会被解析为跳转路径，而是直接写入 HTTP response body 中。
     * 比如异步获取 json 数据，加上 @ResponseBody 后，会直接返回 json 数据。@RequestBody 将 HTTP 请求正文
     * 插入方法中，使用适合的 HttpMessageConverter 将请求体写入某个对象。
     */
    public String array(String[] name) {
        StringBuilder sbf = new StringBuilder();
        for (String item : name) {
            sbf.append(item).append(" ");
        }
        return sbf.toString();
    }

    // todo http://localhost:8080/main_war_exploded/Test/object.do?uid=100&username1=fjaogeji
    // todo http://localhost:8080/main_war_exploded/Test/object.do?uid=100&username1=fjaogeji&contactinfo.phone=111
    // todo http://localhost:8080/main_war_exploded/Test/object.do?uid=100&user.username1=fjaogeji&admin.username=afegg
    @RequestMapping("object.do")
    @ResponseBody
    public String object(User user, Admin admin) {
        return user.toString()+admin.toString();
    }

    @InitBinder
    public void initUser(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("user.");
    }

    @InitBinder
    public void initAdmin(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("admin.");
    }

    /**
     * {
     * 	"uid":645615,
     * 	"username":"gagae",
     * 	"workplace":"gaegag"
     * }
     * @param user
     * @return
     */
    @RequestMapping("json.do")
    @ResponseBody
    public String json(@RequestBody User user) {
        return user.toString();
    }

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    @ResponseBody
    public String book(HttpServletRequest request) {
        String contentType = request.getContentType();
        if (contentType == null) {
            return "book.default";
        } else if (contentType.equals("txt")) {
            return "book.txt";
        } else if (contentType.equals("json")) {
            return "book.json";
        } else {
            return "book.default";
        }
    }

    /**
     * @PathVariable 获取请求路径中参数的值
     * @param subjectId
     * @return
     */
    @RequestMapping(value = "/subject/{subjectId}", method = RequestMethod.POST)
    @ResponseBody
    public String SubjectPost(@PathVariable("subjectId") String subjectId) {
        return "this is a post method, subjectId: " + subjectId;
    }

    @RequestMapping(value = "/subject/{subjectId}", method = RequestMethod.DELETE)
    @ResponseBody
    public String SubjectDelete(@PathVariable("subjectId") String subjectId) {
        return "this is a delete method, subjectId: " + subjectId;
    }

    @RequestMapping(value = "/subject/{subjectId}", method = RequestMethod.GET)
    @ResponseBody
    public String SubjectGet(@PathVariable("subjectId") String subjectId) {
        return "this is a get method, subjectId: " + subjectId;
    }

    @RequestMapping(value = "/subject/{subjectId}", method = RequestMethod.PUT)
    @ResponseBody
    public String SubjectPut(@PathVariable("subjectId") String subjectId) {
        return "this is a put method, subjectId: " + subjectId;
    }

    @Autowired
    Test_Service test_service;

    @RequestMapping("login")
    @ResponseBody
    public String Login(int id) {
        return test_service.selectByID(id);
    }
}
