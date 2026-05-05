package com.joel.demo.controller;

import com.joel.demo.model.User;
import com.joel.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    // 🔹 Register
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userService.register(user);
        return "User registered successfully";
    }

    // 🔹 Login
    @PostMapping("/login")
    public String login(@RequestBody User user) {

        userService.login(user.getUsername(), user.getPassword());

        return "Login successful";
    }
}