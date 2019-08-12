package com.deschen.restful.restfuldemo.service.impl;

import com.deschen.restful.restfuldemo.Exception.GlobalException;
import com.deschen.restful.restfuldemo.enums.ResultVOCodeEnum;
import com.deschen.restful.restfuldemo.mapper.UserMapper;
import com.deschen.restful.restfuldemo.pojo.User;
import com.deschen.restful.restfuldemo.service.UserService;
import jdk.nashorn.internal.runtime.GlobalConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author deschen
 * @Create 2019/8/12
 * @Description
 * @Since 1.0.0
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        boolean success = userMapper.insertSelective(user) > 0 ? true : false;
        if (!success) {
            throw new GlobalException(ResultVOCodeEnum.OPERATION_ERROR);
        }
    }

    @Override
    public void deleteUser(Long id) {
        boolean success = userMapper.deleteByPrimaryKey(id) > 0 ? true : false;
        if (!success) {
            throw new GlobalException((ResultVOCodeEnum.OPERATION_ERROR));
        }
    }

    @Override
    public void updateUser(User user) {
        boolean success = userMapper.updateByPrimaryKeySelective(user) > 0 ? true : false;
        if (!success) {
            throw new GlobalException((ResultVOCodeEnum.OPERATION_ERROR));
        }
    }

    @Override
    public User selectUser(Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        if (user == null) {
            throw new GlobalException((ResultVOCodeEnum.RETURN_NULL));
        }
        return user;
    }

    @Override
    public List<User> selectUsers() {
        List<User> users = userMapper.selectAll();
        return users;
    }
}
