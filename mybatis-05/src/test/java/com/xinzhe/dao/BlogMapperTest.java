package com.xinzhe.dao;

import com.xinzhe.pojo.Blog;
import com.xinzhe.utils.IDUtils;
import com.xinzhe.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlogMapperTest {

    private SqlSession sqlSession;
    private BlogMapper mapper;

    @Before
    public void setUp(){
        sqlSession = MybatisUtils.getSqlSession();
        mapper = sqlSession.getMapper(BlogMapper.class);
    }

    @After
    public void close() {
        sqlSession.close();
    }

    @Test
    public void testAddBlog() {
        for (int i = 0; i < 10; ++i) {
            mapper.addBlog(createBlog());
        }
        sqlSession.commit();
    }

    private Blog createBlog() {
        Blog blog = new Blog();
        String id = IDUtils.getId();
        blog.setId(id);
        blog.setTitle("Title" + id.substring(0, 4));
        blog.setAuthor("Author" + id.substring(0, 2));
        blog.setCreateTime(new Date());
        blog.setViews(IDUtils.getView());
        return blog;
    }

    @Test
    public void testQueryBlogIf() {
        Map<String, String> map = new HashMap<>();
        map.put("title", "Titlee%");
        map.put("author", "Author%");
        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }

    @Test
    public void testQueryBlogChoose() {
        Map<String, String> map = new HashMap<>();
        map.put("title", "Titlee%");
        map.put("author", "Author%");
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }

    @Test
    public void testUpdateBlog() {
        Map<String, String> map = new HashMap<>();
        String id = "e99be046aad246f88b0e6e8f0df84bce";
        map.put("title", "Title" + id.substring(0, 4));
        map.put("author", id.substring(0, 2));
        map.put("id", id);
        mapper.updateBlog(map);

    }
}
