package com.xinzhe.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author xzheng
 * @create 2021/3/20
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;

}
