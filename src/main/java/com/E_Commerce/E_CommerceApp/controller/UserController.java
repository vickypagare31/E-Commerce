package com.E_Commerce.E_CommerceApp.controller;

import com.E_Commerce.E_CommerceApp.entity.User;
import com.E_Commerce.E_CommerceApp.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User>registerUser(@Valid @RequestBody User user)
    {
        User newUser=userService.saveUser(user);
        return new ResponseEntity<>(newUser,HttpStatus.CREATED);
    }

    @GetMapping("/{email}")
    public ResponseEntity<User>geUserByEmail(@PathVariable String email)
    {
        Optional<User> user=userService.findUserByEmail(email);
        return user.map(ResponseEntity::ok).orElseGet(()-> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping()
    public List<User> getAllUsers()
    {
       return userService.getAllUsers();
    }
}
