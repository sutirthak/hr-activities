package com.projects.service;

import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import com.qinvent.hr.models.Employee;
import com.qinvent.hr.service.EmployeeServIMPL;
import static org.junit.jupiter.api.Assertions.assertFalse;
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

}
