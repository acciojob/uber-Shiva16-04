package com.driver.model;

import javax.persistence.*;

public class Cab{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int perKmRate;
    private boolean available;
    @OneToOne(mappedBy = "cab",cascade = CascadeType.ALL)
    @JoinColumn
    private Driver driver;
}