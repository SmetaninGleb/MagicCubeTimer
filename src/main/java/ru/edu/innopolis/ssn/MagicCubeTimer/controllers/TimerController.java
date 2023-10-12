package ru.edu.innopolis.ssn.MagicCubeTimer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TimerController {

    @GetMapping("/timer")
    public String timer() {
        return "timer";
    }
}
