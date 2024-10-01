package com.E_Commerce.E_CommerceApp.service;

import com.E_Commerce.E_CommerceApp.entity.User;
import com.E_Commerce.E_CommerceApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user)
    {
        return userRepository.save(user);
    }

    public Optional<User> findUserByEmail(String email)
    {
        return userRepository.findByEmail(email);
    }

    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }
}
