package com.example.assignment_cfg_example.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="otters")
@Data // not essential
public class Otter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "species")
    private String species;

    @Column(name = "age")
    private int age;

    @Column(name = "weight")
    private double weight;
}
