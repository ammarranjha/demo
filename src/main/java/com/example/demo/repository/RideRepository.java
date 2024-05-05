package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Ride;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {

    List<Ride> findByUserId(Long userId);
}
