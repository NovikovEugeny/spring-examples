package by.tc.example.controller;

import by.tc.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String forwardToHello() {

        return "index";
    }

    @RequestMapping("/welcome")
    public String forwardToWelcome() {

        return "welcome";
    }
}