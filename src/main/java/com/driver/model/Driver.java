package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;

public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;
    private String mobile;
    private String password;
    @OneToOne
    @JoinColumn
    private Cab cab;
    @OneToMany
    @JoinColumn
    private List<TripBooking>tripBookingList=new ArrayList<>()
}