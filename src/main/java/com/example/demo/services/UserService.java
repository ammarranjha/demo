package com.example.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ride;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.RideRepository;


import java.util.List;

@Service
public class UserService {

    @Autowired
    private RideRepository rideRepository;
    @Autowired
    private UserRepository userRepository;

    

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }


    public List<Ride> getRidesByUserId(Long userId) {
        return rideRepository.findByUserId(userId);
    }
    
}
