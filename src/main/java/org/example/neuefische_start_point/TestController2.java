package org.example.neuefische_start_point;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/noapi")
public class TestController2 {

    @RequestMapping("/home")
    public String home () {

        return "home";
    }

    @RequestMapping("/")
    public String index () {

        return "Hello";
    }
}
