package com.example.scout_bbs_server.mapper;

import com.example.scout_bbs_server.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM tukuuserdatas ")
    List<User> findAll();
}
