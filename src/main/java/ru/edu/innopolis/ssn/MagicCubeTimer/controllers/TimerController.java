package ru.edu.innopolis.ssn.MagicCubeTimer.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.edu.innopolis.ssn.MagicCubeTimer.models.User;

@Controller
public class TimerController {

    @GetMapping("/timer")
    public String timer(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("userData", user);
        return "timer";
    }
}
