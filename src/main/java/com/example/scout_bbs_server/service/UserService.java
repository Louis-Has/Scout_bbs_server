package com.example.scout_bbs_server.service;

import com.example.scout_bbs_server.entity.User;
import com.example.scout_bbs_server.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

//    public int register(User user) {
//        return userMapper.insert(user);
//    }

    public int save(User user) {
        if (user.getUserId() == null) {
            return userMapper.insert(user);
        } else {
            return userMapper.update(user);
        }
    }
}
