package com.hrms.hrmsbeginner.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "team")
@Data
public class Team extends BaseEntity {

//    @ManyToMany(mappedBy = "teams")
//    private List<Employee> employeeList;
}
