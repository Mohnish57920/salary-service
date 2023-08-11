package com.gkeexample.salaryservice.service;

import com.gkeexample.salaryservice.model.Salary;
import org.springframework.stereotype.Service;

import java.util.OptionalInt;
import java.util.Random;

@Service
public class SalaryService {

    public Salary getSalary() {
        Random random = new Random();
        OptionalInt amt = random.ints(30000, 50000)
                .findFirst();
        return new Salary(amt.getAsInt(), "USD");
    }
}
