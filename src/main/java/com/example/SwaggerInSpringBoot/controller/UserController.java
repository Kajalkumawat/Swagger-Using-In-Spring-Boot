package com.example.SwaggerInSpringBoot.controller;

import com.example.SwaggerInSpringBoot.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {

    @GetMapping()
    public List<User> getUsers() {
        return User.dummyUsers();
    }

}
