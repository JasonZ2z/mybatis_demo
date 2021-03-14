package com.xinzhe.dao;

import com.xinzhe.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author MI
 */
public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    void addUser(User user);

    void updateUser(User user);

    boolean deleteUser(int id);

    // Map
    void addUser2(Map<String, Object> map);

    User getUserById2(Map<String, Object> map);

    //like
    List<User> getUserLike(String s);
}