package com.hrms.hrmsbeginner.model;


import jakarta.persistence.*;
import lombok.Data;

@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

}