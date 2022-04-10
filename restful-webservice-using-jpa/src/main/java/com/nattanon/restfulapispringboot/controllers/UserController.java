package com.nattanon.restfulapispringboot.controllers;

import com.nattanon.restfulapispringboot.entities.User;
import com.nattanon.restfulapispringboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }

    @PutMapping("/user/{id}")
    public User updateUserById(@PathVariable("id") Long id, @RequestBody User user) {
        return userService.updateUserById(id, user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
    }

    @GetMapping("/user/username/{username}")
    public Optional<User> getUserByUsername(@PathVariable("username") String username) {
        return userService.getUserByUsername(username);
    }
}
