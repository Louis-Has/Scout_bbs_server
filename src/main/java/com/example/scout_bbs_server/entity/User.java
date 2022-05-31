package com.example.scout_bbs_server.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String phone;
    private String email;
    private String password;
    private String company;
}
