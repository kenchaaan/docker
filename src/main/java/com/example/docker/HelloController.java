package com.example.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping
    public String greeting() {
        return "Hello Docker";
    }
}
