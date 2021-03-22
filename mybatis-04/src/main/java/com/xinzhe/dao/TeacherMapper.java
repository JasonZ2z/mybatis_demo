package com.xinzhe.dao;

import com.xinzhe.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getAllTeacher();

    //获取指定老师的所有学生
    List<Teacher> getAllTeacherById(@Param("tid") int id);

    //获取指定老师的所有学生嵌套查询实现
    List<Teacher> getTeacher2(@Param("tid") int id);
}