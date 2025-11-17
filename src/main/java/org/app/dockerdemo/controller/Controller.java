package org.app.dockerdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${application.message}")
   private String message;

    @GetMapping("/")
    public String getMessage() {
        return message;
    }

}
