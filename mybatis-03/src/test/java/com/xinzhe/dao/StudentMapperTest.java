package com.xinzhe.dao;

import com.xinzhe.pojo.Student;
import com.xinzhe.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {

    private SqlSession sqlSession;
    private StudentMapper mapper;


    @Before
    public void setUp(){
        sqlSession = MybatisUtils.getSqlSession();
        mapper = sqlSession.getMapper(StudentMapper.class);
    }

    @After
    public void close() {
        sqlSession.close();
    }

    @Test
    public void testAllStudent(){
        List<Student> student = mapper.getStudent();
        for (Student s : student) {
            System.out.println(s);
        }
    }


    @Test
    public void testGetStudentTeacher() {
        List<Student> student = mapper.getStudentTeacher();
        for (Student s : student) {
            System.out.println(s);
        }
    }

    @Test
    public void getStudentTeacherByTid() {
        List<Student> student = mapper.getStudentTeacherByTid();
        for (Student s : student) {
            System.out.println(s);
        }
    }
}