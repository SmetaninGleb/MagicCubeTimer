package ru.edu.innopolis.ssn.MagicCubeTimer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AuthController {

    @GetMapping("/auth")
    public String auth() {
        return "login";
    }

    @GetMapping
    public String startPage() {
        return "redirect:/auth";
    }

    @GetMapping("/login")
    public String loginRedirect() {
        return "redirect:/timer";
    }
}
