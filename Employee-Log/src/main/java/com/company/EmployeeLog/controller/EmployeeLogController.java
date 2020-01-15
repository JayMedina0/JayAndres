package com.company.EmployeeLog.controller;

import com.company.EmployeeLog.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Employee")
public class EmployeeLogController {

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    private void getEmployee(@PathVariable int id) {

    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    private void getAllEmployees() {

    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    private void putEmployee(@PathVariable int id) {

    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    private void postEmployee() {

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    private void deleteEmployee(@PathVariable int id) {

    }

}
