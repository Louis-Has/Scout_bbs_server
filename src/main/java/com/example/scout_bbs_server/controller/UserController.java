package com.example.scout_bbs_server.controller;

import com.example.scout_bbs_server.entity.User;
import com.example.scout_bbs_server.mapper.UserMapper;
import com.example.scout_bbs_server.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;
    @Resource
    private UserService userService;

    @GetMapping()  //test
    public String index() {
        return "okay_okay";
    }

    @GetMapping("/getUser")  // test
    public List<User> getUser() {
        return userMapper.findAllUser();
    }

    @PostMapping("/register")
    public Integer register(@RequestBody User user) {
        return userService.register(user);
    }


}
