package ru.aston.task01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello-world")
public class HelloWorldController {
    public static final String HELLO_WORLD = "hello-world";

    @GetMapping
    public String showHelloWorld() {

        return HELLO_WORLD;
    }
}
