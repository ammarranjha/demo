package com.example.demo.model;


import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {

 @Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String name;

@OneToMany(mappedBy="user",cascade =  CascadeType.ALL)
private List<Ride> rides;


public void setName(String name) {
    this.name = name;
}

public String getName() {
    return this.name;
}

public long getId() {
    return this.id;

}

}