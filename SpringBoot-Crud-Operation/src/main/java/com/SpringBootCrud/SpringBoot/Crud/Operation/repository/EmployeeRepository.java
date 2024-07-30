package com.SpringBootCrud.SpringBoot.Crud.Operation.repository;

import com.SpringBootCrud.SpringBoot.Crud.Operation.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
