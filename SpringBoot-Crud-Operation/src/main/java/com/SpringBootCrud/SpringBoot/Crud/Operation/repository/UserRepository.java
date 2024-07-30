package com.SpringBootCrud.SpringBoot.Crud.Operation.repository;

import com.SpringBootCrud.SpringBoot.Crud.Operation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
