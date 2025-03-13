package com.springbasic.curd.service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbasic.curd.entity.Employee;
import com.springbasic.curd.repository.EmpRepo;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class EmpService {
	
	@Autowired
    private  EmpRepo empRepo;

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(EmpService.class);

        
     public Employee createEmployee(Employee employee) {
            log.info("Entering createEmployee() - Creating new employee: {}", employee);
            Employee savedEmployee = empRepo.save(employee);
            log.info("Employee created successfully with ID: {}", savedEmployee.getId());
            return savedEmployee;
        }
    

    public List<Employee> getAllEmployee() {
        log.info("Fetching all employee");
        return empRepo.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        log.info("Fetching employee with ID: {}", id);
        return empRepo.findById(id);
        
   
}
    public Employee updatedEmployee(Long id, Employee updatedEmployee) {
        return empRepo.findById(id).map(employee -> {
            employee.setName(updatedEmployee.getName());
            employee.setDepartment(updatedEmployee.getDepartment());
            return empRepo.save(employee);
        }).orElseThrow(() -> new RuntimeException("employee not found"));
    }

   // public void deleteEmployee(Long id) {
    //    log.warn("Deleting employee with ID: {}", id);
     //   empRepo.deleteById(id);
    public void deleteEmployee(Long id) {
        log.info("Entering deleteEmployee() - Attempting to delete employee with ID: {}", id);
        
        if (empRepo.existsById(id)) {
            empRepo.deleteById(id);
            log.warn("Employee with ID {} deleted successfully", id);
        } else {
            log.error("Delete failed - Employee with ID {} not found", id);
            throw new RuntimeException("Employee not found");
            
        }
    }
    																									
        
    }


	
    
