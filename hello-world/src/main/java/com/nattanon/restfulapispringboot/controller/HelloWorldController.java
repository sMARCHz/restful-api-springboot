package com.nattanon.restfulapispringboot.controller;

import com.nattanon.restfulapispringboot.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/bean")
    public User helloWorldBean() {
        return new User("Nattanon", "Chansamakr", "Bangkok");
    }
}
