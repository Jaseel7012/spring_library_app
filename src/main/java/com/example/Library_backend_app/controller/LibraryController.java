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
    @PostMapping("/userlog")
    public String UserLogin(){
        return "user login";
    }
    @PostMapping("/userreg")
    public String UserReg(){
        return "user registration page";
    }
    @PostMapping("/addbook")
    public  String AddBook(){
        return "Add book page";
    }
    @PostMapping("/edit")


    public String EditBook(){
        return "edit book";
    }
}
