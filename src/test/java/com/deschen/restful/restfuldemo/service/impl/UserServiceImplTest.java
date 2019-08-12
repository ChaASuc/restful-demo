package com.deschen.restful.restfuldemo.service.impl;

import com.deschen.restful.restfuldemo.TestUtil;
import com.deschen.restful.restfuldemo.pojo.User;
import com.deschen.restful.restfuldemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

@Slf4j
public class UserServiceImplTest extends TestUtil {

    @Autowired
    private UserService userService;

    @Test
    public void insertUser() {
        User user = new User();
        for (long i = 0; i <= 10L; i++) {
            user.setId(i);
            user.setName("张三" + i + "号");
            user.setAge(13);
            user.setEmail("123.qq.com");
            userService.insertUser(user);
        }
    }

    @Test
    public void deleteUser() {
        userService.deleteUser(1L);
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(1L);
        user.setName("张三0号");
        userService.updateUser(user);
    }

    @Test
    public void getUser() {
        User user = userService.selectUser(1L);
    }
}