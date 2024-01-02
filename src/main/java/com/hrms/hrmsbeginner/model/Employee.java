package com.hrms.hrmsbeginner.model;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="employee")
@Data
public class Employee extends BaseEntity{

    @Column
    private String email;

}
