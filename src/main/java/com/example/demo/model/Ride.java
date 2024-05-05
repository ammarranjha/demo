package com.example.demo.model;


import jakarta.persistence.*;

@Entity
@Table(name="rides")
public class Ride {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    public long id;

   public String Origin;
   public String Destination;

@ManyToOne
@JoinColumn(name="user_id", nullable = false)
 public User user;   
    
public void setOrigin(String origin) {
    this.Origin = origin;   
}
public void setDestination(String destination) {
    this.Destination = destination; 
}

}
