package com.hrms.hrmsbeginner.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Table(name = "employee")
@Data
public class Employee extends BaseEntity {

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "blood_group")
    private String bloodGroup;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Department department;

//    @ManyToMany
//    @JoinTable(name = "employee_teams",
//            joinColumns = @JoinColumn(name = "id"),
//            inverseJoinColumns = @JoinColumn(name = "id"))
//    private List<Team> teams;
}
