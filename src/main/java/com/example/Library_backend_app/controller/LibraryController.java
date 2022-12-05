package com.example.Library_backend_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    @PostMapping("/admin")
    public String AdminLogin(){
        return "Admin Login page";
    }
}
