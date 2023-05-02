package com.listemployee.listemployee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(path ="/employee")
public class EmployeeController {
    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public Employee addEmployeeInfo(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.add(firstName, lastName);


    }

    @GetMapping(path = "/remove")
    public Employee removeEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.remove(firstName, lastName);


    }

    @GetMapping(path = "/find")
    public Employee findEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.find(firstName, lastName);
    }
    @GetMapping
    public Collection<Employee> findAll(){
        return employeeService.findAll();
    }
}
