package com.company.EmployeeLog.dao;

import com.company.EmployeeLog.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeDaoTest {

    @Autowired
    EmployeeDao dao;


    Employee employee;

    @BeforeEach
    void setUp() {
        dao.deleteAll();
    }

    @Test
    private void methodName() {

    }



}