package com.springboot_thymeleaf_crud.springboot_thymeleaf_crud.repository;
import com.springboot_thymeleaf_crud.springboot_thymeleaf_crud.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}