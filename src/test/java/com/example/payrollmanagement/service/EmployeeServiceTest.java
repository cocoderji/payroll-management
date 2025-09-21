package com.example.payrollmanagement.service;

import com.example.payrollmanagement.entity.Employee;
import com.example.payrollmanagement.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @MockBean
    private EmployeeRepository employeeRepository;

    @Test
    public void testAddEmployee() {
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setAge(25);
        employee.setRating(1);
        
        Mockito.when(employeeRepository.save(employee)).thenReturn(employee);
        Employee savedEmployee = employeeService.addEmployee(employee);
        
        assertNotNull(savedEmployee);
        assertEquals(40000, savedEmployee.getSalary());
    }
}
