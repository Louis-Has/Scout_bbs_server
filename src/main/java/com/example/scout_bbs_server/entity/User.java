package com.example.scout_bbs_server.entity;

import lombok.Data;

@Data
public class User {
    private Integer userId;
    private String name;
    private String phone;
    private String email;
    private String password;
    private String company;
    private String create_time;
}
