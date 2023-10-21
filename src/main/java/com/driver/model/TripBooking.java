package com.driver.model;

import com.driver.model.Driver;
import com.driver.model.TripStatus;

import javax.persistence.*;

public class TripBooking{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripBookingId;
    private String fromLocation;
    private String toLocation;
    private int distanceInKm;
    @Enumerated(value = EnumType.STRING)
    private TripStatus status;
    private int bill;
    @ManyToOne
    @JoinColumn
    private Driver driver;
}