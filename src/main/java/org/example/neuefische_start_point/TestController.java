package org.example.neuefische_start_point;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {


    @GetMapping("/hello")
    public String printHelloWorld () {

        return "Hello, World!";
    }





}
