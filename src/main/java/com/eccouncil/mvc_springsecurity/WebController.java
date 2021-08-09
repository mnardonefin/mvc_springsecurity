package com.eccouncil.mvc_springsecurity;

import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {

    @GetMapping("/")
    public String home(){
        return "<h1>Welcome to Practical Spring Security Video Course by EC Council</h1>" +
                "<p>Log in as <a href='/user'>user</a> or as <a href='/admin'>admin</a>!</p>";
    }

    @GetMapping("/user")
    public String user()
    {
        return "Welcome User! <p><a href='/logout'>...logout!</a></p>";
    }

    @GetMapping("/admin")
    public String admin()
    {
        return "Welcome Admin!  <p><a href='/logout'>...logout!</a></p>";
    }


}






