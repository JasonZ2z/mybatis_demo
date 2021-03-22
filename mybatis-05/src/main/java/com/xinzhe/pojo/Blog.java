/* Copyright © 2021 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package com.xinzhe.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author xzheng
 * @since 1.0
 */

@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;  // 属性和字段不一致
    private int views;
}
