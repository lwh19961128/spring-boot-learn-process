package com.example.controller;

import com.example.common.api.Result;
import com.example.mapper.UserMapper;
import com.example.model.User;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @PostMapping(value = "/create")
    public Result create(@RequestBody User user) {
        userMapper.insert(user);
        return Result.success();
    }

    @GetMapping(value = "/list")
    public Result list() {
        List<User> userlist = userMapper.userlist();
        return Result.success(userlist);
    }

    @PostMapping(value = "/update")
    public Result update(@RequestBody User usr) {
        User user = userMapper.getById(usr.getId());
        if (user == null) {
            return Result.error("用户不存在");
        }
        userMapper.updateById(usr);
        return Result.success();
    }

    @GetMapping(value = "/queryByUserName")
    public Result info(@RequestParam(value = "username") String username) {
        User user = userMapper.getUserByName(username);
        if (user == null) {
            return Result.error("用户不存在");
        }
        return Result.success(user);
    }
}
