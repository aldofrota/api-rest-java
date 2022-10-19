package com.api.users.controller;

import com.api.users.model.UserModel;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @GetMapping(path = "/users")
    public String getUsers() {
        return "Hello Word";
    }

    @GetMapping(path = "/users/{id}")
    public Integer getUser(@PathVariable("id") Integer id) {
        return id;
    }

    @PostMapping(path = "/users")
    public UserModel setUser(@RequestBody UserModel user) {
        return user;
    }

    @DeleteMapping(path = "/users/{id}")
    public Boolean deleteUser(@PathVariable("id") Integer id) {
        return true;
    }
}
