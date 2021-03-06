package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class ControllerSimple {

    @GetMapping()
    public String indexController(){
        return "index";
    }

    @GetMapping("hello")
    public String helloController(){
        return "hello";
    }

}
