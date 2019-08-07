package com.imooc.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController // @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UseController {

    @RequestMapping("/getUser")
    @ResponseBody
    public Object getUser() {

        User user  = new User();
        user.setName("Tron");
        user.setPassword("123456");
        user.setAge(18);
        user.setBirthday(new Date());
        user.setDesc(null);

        return user;
    }

    @RequestMapping("/getUserJson")
    @ResponseBody
    public IMoocJSONResult getUserJson() {
        User user  = new User();
        user.setName("Tron");
        user.setPassword("123456");
        user.setAge(18);
        user.setBirthday(new Date());
        user.setDesc(null);

        return IMoocJSONResult.ok(user);
    }
}
