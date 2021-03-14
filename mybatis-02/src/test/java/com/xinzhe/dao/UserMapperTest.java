package com.xinzhe.dao;

import com.xinzhe.pojo.User;
import com.xinzhe.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


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
}