package com.E_Commerce.E_CommerceApp.controller;

import com.E_Commerce.E_CommerceApp.entity.User;
import com.E_Commerce.E_CommerceApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User>registerUser(@PathVariable User user)
    {
        User newUser=userService.saveUser(user);
        return new ResponseEntity<>(newUser,HttpStatus.CREATED);
    }

    public ResponseEntity<User>geUserByEmail(String email)
    {
        Optional<User> user=userService.findUserByEmail(email);
        return 
    }
}
