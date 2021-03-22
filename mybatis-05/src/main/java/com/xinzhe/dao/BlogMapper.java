/* Copyright © 2021 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package com.xinzhe.dao;

import com.xinzhe.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author xzheng
 * @since 1.0
 */
public interface BlogMapper {

    int addBlog(Blog blog);

    List<Blog> queryBlogIf(Map map);

    List<Blog> queryBlogChoose(Map map);

    int updateBlog(Map map);
}
