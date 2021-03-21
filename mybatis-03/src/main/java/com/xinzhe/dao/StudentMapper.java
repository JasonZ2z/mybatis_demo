package com.xinzhe.dao;

import com.xinzhe.pojo.Student;

import java.util.List;

/**
 * @author xzheng
 * @create 2021/3/20
 */
public interface StudentMapper {

    List<Student> getStudent();
    List<Student> getStudentTeacher();
    List<Student> getStudentTeacherByTid();
}
