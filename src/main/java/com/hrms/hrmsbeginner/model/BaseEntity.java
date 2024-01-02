package com.hrms.hrmsbeginner.model;


import jakarta.persistence.*;
import lombok.Data;



import java.io.Serializable;

@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

}