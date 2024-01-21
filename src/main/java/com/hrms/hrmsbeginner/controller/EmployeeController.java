package com.hrms.hrmsbeginner.controller;


import com.hrms.hrmsbeginner.model.Employee;
import com.hrms.hrmsbeginner.repository.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employee")
    public ResponseEntity<?>  getEmployee() {

        List<Employee> employeeList = employeeRepository.findAll();
        return new ResponseEntity<>("Employee list : " + employeeList, HttpStatus.OK);
    }

    @PostMapping("/addemployee")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return new ResponseEntity<>("added",HttpStatus.OK);
    }
}
