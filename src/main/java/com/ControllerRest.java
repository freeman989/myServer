package com;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class ControllerRest {

    User user = new User(1,"Maria",25);

    @GetMapping("user")
    public User getController(){

        return user;
    }

}
