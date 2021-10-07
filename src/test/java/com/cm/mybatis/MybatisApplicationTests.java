package com.cm.mybatis;

import com.cm.mybatis.bean.User;
import com.cm.mybatis.mapper.UserMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MybatisApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {

    }
    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
        //插入
        User user=new User();
        user.setId(System.currentTimeMillis());
        user.setAge(20);
        user.setEmail("1336257044@qq.com");
        userMapper.insert(user);
    }

}
