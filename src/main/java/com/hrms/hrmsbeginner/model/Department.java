package com.hrms.hrmsbeginner.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "department")
@Data
public class Department extends BaseEntity {

    @OneToMany(mappedBy = "department")
    private List<Employee> employee;
}
