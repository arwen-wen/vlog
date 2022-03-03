package com.arwen.vlog.controller;

import java.util.ArrayList;
import java.util.List;

import com.arwen.vlog.entity.User;
import com.mysql.cj.util.StringUtils;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value="/api")
public class RequestTestController {
    
    @RequestMapping(value="/test1", method=RequestMethod.GET)
    public String test1(String info) {
        if (StringUtils.isEmptyOrWhitespaceOnly(info)) {
            return "Please input info!";
        }
        return "API return: " + info;
    }

    @RequestMapping(value="/test2", method=RequestMethod.GET)
    public List<User> test2() {
        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setName("name1");
        user1.setPassword("password1");
        User user2 = new User();
        user2.setName("name2");
        user2.setPassword("password2");
        list.add(user1);
        list.add(user2);
        return list;
    }
}
