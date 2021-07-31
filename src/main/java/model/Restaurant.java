package model;

import javax.persistence.*;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int restaurant;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;

}
