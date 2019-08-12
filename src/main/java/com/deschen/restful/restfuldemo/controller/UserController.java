package com.deschen.restful.restfuldemo.controller;

import com.deschen.restful.restfuldemo.pojo.User;
import com.deschen.restful.restfuldemo.service.UserService;
import com.deschen.restful.restfuldemo.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author deschen
 * @Create 2019/8/12
 * @Description
 * @Since 1.0.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResultVO insertUser(
            @RequestBody User user
    ) {
        userService.insertUser(user);
        ResultVO.success();
        return ResultVO.success();
    }

    @PutMapping("/user")
    public ResultVO updateUser(
            @RequestBody User user
    ) {
        userService.updateUser(user);
        return ResultVO.success();
    }

    @DeleteMapping("/user/{id}")
    public ResultVO deleteUser(
            @PathVariable Long id
    ) {
        userService.deleteUser(id);
        return ResultVO.success();
    }

    @GetMapping("/user/{id}")
    public ResultVO selectUser(
            @PathVariable Long id
    ) {
        User user = userService.selectUser(id);
        return ResultVO.success(user);
    }


    @GetMapping("/users")
    public ResultVO selectUsers() {
        List<User> users = userService.selectUsers();
        return ResultVO.success(users);
    }
}
