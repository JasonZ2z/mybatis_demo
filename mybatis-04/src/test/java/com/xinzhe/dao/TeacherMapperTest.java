package com.xinzhe.dao;

import com.xinzhe.pojo.Teacher;
import com.xinzhe.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TeacherMapperTest {

    private SqlSession sqlSession;
    private TeacherMapper mapper;

    @Before
    public void setUp(){
        sqlSession = MybatisUtils.getSqlSession();
        mapper = sqlSession.getMapper(TeacherMapper.class);
    }

    @After
    public void close() {
        sqlSession.close();
    }

    @Test
    public void testALlTeacher(){
        List<Teacher> allTeacher = mapper.getAllTeacher();
        for (Teacher teacher : allTeacher) {
            System.out.println(teacher);
        }
    }

    @Test
    public void testALlTeacherById(){
        List<Teacher> allTeacher = mapper.getAllTeacherById(1);
        for (Teacher teacher : allTeacher) {
            System.out.println(teacher);
        }
    }

    @Test
    public void testALlTeacherById2(){
        List<Teacher> allTeacher = mapper.getTeacher2(1);
        for (Teacher teacher : allTeacher) {
            System.out.println(teacher);
        }
    }
}