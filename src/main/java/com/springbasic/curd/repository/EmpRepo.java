package com.springbasic.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbasic.curd.entity.Employee;
@Repository
public interface EmpRepo extends JpaRepository<Employee, Long> {

}
