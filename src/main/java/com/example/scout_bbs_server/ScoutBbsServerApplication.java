package com.example.scout_bbs_server;

import com.example.scout_bbs_server.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication

public class ScoutBbsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScoutBbsServerApplication.class, args);
    }

    @GetMapping()
    public String index() {
        return "okkaaa";
    }

    @GetMapping("user")
    public String addUser() {
        User user = new User();
        user.setName("sss");
        return "ok....";
    }
}
