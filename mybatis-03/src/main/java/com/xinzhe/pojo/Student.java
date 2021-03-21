package com.xinzhe.pojo;

import lombok.Data;

/**
 * @author xzheng
 * @create 2021/3/20
 */
@Data
public class Student {
    private int id;
    private String name;
    private Teacher teacher;
}
