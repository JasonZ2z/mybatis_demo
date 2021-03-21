package com.xinzhe.dao;

import com.xinzhe.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TeacherMapperTest {

    private SqlSession sqlSession;
    private TeacherMapper mapper;

    @Before
    public void setUp(){
        sqlSession = MybatisUtils.getSqlSession();
        mapper = sqlSession.getMapper(TeacherMapper.class);
    }

    @After
    public void tearDown() throws Exception {
        sqlSession.close();
    }

    @Test
    public void getTeacherById() {
        System.out.println(mapper.getTeacher(1));
    }
}