package com.SpringBootCrud.SpringBoot.Crud.Operation.service;

import com.SpringBootCrud.SpringBoot.Crud.Operation.entity.Employee;
import com.SpringBootCrud.SpringBoot.Crud.Operation.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
