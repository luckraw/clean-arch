package com.luckraw.cleanarch.controller;

import com.luckraw.cleanarch.model.User;
import com.luckraw.cleanarch.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.save(user);
    }
}
