package com.deschen.restful.restfuldemo.mapper;

import com.deschen.restful.restfuldemo.TestUtil;
import com.deschen.restful.restfuldemo.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@Slf4j
public class StudentMapperTest extends TestUtil {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertTest() {
        User user = new User();
        for (long i = 0; i <= 10L; i++) {
            user.setId(i);
            user.setName("张三" + i + "号");
            user.setAge(13);
            user.setEmail("123.qq.com");
            int i1 = userMapper.insertSelective(user);
            Assert.assertEquals(1, i1);
        }
    }

    @Test
    public void selectTest() {
        List<User> users = userMapper.selectAll();
        Assert.assertEquals(11, users.size());
    }
}