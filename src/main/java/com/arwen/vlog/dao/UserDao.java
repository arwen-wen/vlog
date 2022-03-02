package com.arwen.vlog.dao;

import com.arwen.vlog.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAllUsers();

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(Integer id);

}
