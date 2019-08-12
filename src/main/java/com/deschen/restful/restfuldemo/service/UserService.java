package com.deschen.restful.restfuldemo.service;

import com.deschen.restful.restfuldemo.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author deschen
 * @Create 2019/8/12
 * @Description
 * @Since 1.0.0
 */
public interface UserService {

    void insertUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    User selectUser(Long id);

    List<User> selectUsers();
}
