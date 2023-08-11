package com.gkeexample.salaryservice.controller;

import com.gkeexample.salaryservice.model.Salary;
import com.gkeexample.salaryservice.service.SalaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final SalaryService salaryService;

    public Controller(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    @GetMapping("/get-salary")
    public Salary getEmployeeList() {
        return salaryService.getSalary();
    }
}
