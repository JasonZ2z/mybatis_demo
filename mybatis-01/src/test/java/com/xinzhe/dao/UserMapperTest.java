package com.xinzhe.dao;

import com.xinzhe.pojo.User;
import com.xinzhe.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    private SqlSession sqlSession;
    private UserMapper mapper;

    @Before
    public void setUp(){
        sqlSession = MybatisUtils.getSqlSession();
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    @After
    public void close() {
        sqlSession.close();
    }

    @Test
    public void testGetAllUser(){
        for (User user : mapper.getUserList()) {
            System.out.println(user);
        }
    }

    @Test
    public void testGetUserById(){
        System.out.println(mapper.getUserById(1).getId());
    }

    @Test
    public void testAddUser(){
        int size = mapper.getUserList().size();
        mapper.addUser(new User(size + 1, "zx", "123456"));
        //sqlSession.commit();
        Assert.assertEquals(mapper.getUserList().size(), size + 1);
    }

    @Test
    public void testUpdateUser(){
        List<User> userList = mapper.getUserList();
        int size = userList.size();
        mapper.updateUser(new User(size, "zx1", "123"));
        //sqlSession.commit();
        Assert.assertEquals(mapper.getUserList().get(size - 1).getName(), "zx1");
    }

    @Test
    public void testDeleteUser(){
        List<User> userList = mapper.getUserList();
        int size = userList.size();
        mapper.deleteUser(size);
        //sqlSession.commit();
        Assert.assertEquals(mapper.getUserList().size(), size - 1);
    }

    @Test
    public void testAddUser2(){
        int size = mapper.getUserList().size();
        Map<String, Object> map = new HashMap<>();
        map.put("id", size + 1);
        map.put("name", "zx");
        map.put("pwd", "123456");
        mapper.addUser2(map);
        //sqlSession.commit();
        Assert.assertEquals(mapper.getUserList().size(), size + 1);
    }

    @Test
    public void testGetUserById2(){
        Map<String, Object> map = new HashMap<>();
        map.put("id", 5);
        System.out.println(mapper.getUserById2(map));
    }

    @Test
    public void testGetUserLike(){
        List<User> list = mapper.getUserLike("zx%");
        for (User user : list) {
            System.out.println(user);
        }
    }
}