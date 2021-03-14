package com.xinzhe.dao;

import com.xinzhe.pojo.User;

import java.util.List;

/**
 * @author MI
 */
public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    void addUser(User user);

    void updateUser(User user);

    boolean deleteUser(int id);

}