package by.tc.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String forwardToHello() {

        return "index";
    }

    @RequestMapping("/welcome")
    public String forwardToWelcome() {

        return "welcome";
    }
}