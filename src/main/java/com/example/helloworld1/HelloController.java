package com.example.helloworld1;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
	public String hello() {
        return "hello";
    }
}
