package com.arwen.vlog.service;

import javax.annotation.Resource;

import com.arwen.vlog.dao.UserDao;
import com.arwen.vlog.entity.User;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionTestService {
    @Resource
    UserDao userDao;

    public Boolean test1() {
        User user = new User();
        user.setPassword("test1-password");
        user.setName("test1");
        userDao.insertUser(user);
        System.out.println(1 / 0);
        return true;
    }

    @Transactional
    public Boolean test2() {
        User user = new User();
        user.setPassword("test2-password");
        user.setName("test2");
        userDao.insertUser(user);
        System.out.println(1 / 0);
        return true;
    }
}
