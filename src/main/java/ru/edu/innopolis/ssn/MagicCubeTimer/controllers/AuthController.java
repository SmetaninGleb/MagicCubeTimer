package ru.edu.innopolis.ssn.MagicCubeTimer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {

    @GetMapping
    public String auth() {
        return "Hello!";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Hello SECURED!";
    }
}
