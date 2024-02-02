package com.projects.service;

import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import com.qinvent.hr.models.Employee;
import com.qinvent.hr.service.EmployeeServIMPL;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Test class for EmployeeServIMPL.java
 */
@SpringBootTest(classes = {EmployeeServIMPL.class})
@RunWith(MockitoJUnitRunner.class)
public class EmployeeServIMPLTest {

    @InjectMocks
    private EmployeeServIMPL employeeservice;

    @Test
    public void shouldReturnAllEmployees() {
        List<Employee> expected = employeeservice.getAllEmployee();
        assertFalse(expected.isEmpty());
    }

    @Test
    public void whenAddEmployee_shouldReturnEmployee() {
        Employee user = new Employee();
        user.setName("Test Name");
        when(employeeservice.addEmployee(ArgumentMatchers.any(Employee.class))).thenReturn(user);
        Employee created = employeeservice.addEmployee(user);
        assertThat(created.getName()).isSameAs(user.getName());
        verify(employeeservice).addEmployee(user);
    }

    @Test
    public void whenDeleteEmployee_shouldReturnString() {
        Employee user = new Employee();
        user.setId(1);
        when(employeeservice.removeEmployee(1)).thenReturn("user");
        String deleted = employeeservice.removeEmployee(1);
        assertThat(deleted).isSameAs("user");
    }

}
