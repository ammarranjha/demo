package com.example.demo.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ride;
import com.example.demo.repository.RideRepository;

import java.util.List;

@Service
public class RideService {
    @Autowired
    private RideRepository rideRepository;

    public List<Ride> getAllRides() {
        return rideRepository.findAll();
    }

    public Ride saveRide(Ride ride) {
        return rideRepository.save(ride);
    }
}

