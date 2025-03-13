package com.springbasic.curd.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springbasic.curd.entity.Employee;
import com.springbasic.curd.service.EmpService;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/employees")
public class EmpController {
	

	@Autowired
    private EmpService empService;
	
//    @GetMapping
//	public String home( 
//	 @RequestParam(defaultValue="default value",required=false)String value	
//	 ){
//    	logger.info("This is the api calling {}",value);
//    	logger.debug("this is api calling {}",value);
//    	logger.error("this is api calling {}",value);
//    	logger.warn("This is api calling {}",value);
//    	logger.trace("This is api calling {}",value);
//s
//    	return "This is home api";
//    	
//    }

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return empService.createEmployee(employee);
    }
    
    @GetMapping("/calc")
    public String calc()
    {
    	
		Logger log=(Logger) LoggerFactory.getLogger(EmpController.class);
//		log.debug("Debug Log");
//    	log.info("Info log");
//    	log.warn("Warning Log");
//    	log.error("Error Log");
//    	
//    	
//		return "Welcome clover";
//		
    	
		log.info("develop by clover");
    	int a,b,c=0; 
    	try {
    		a=10;
    		b=0;
    		c=a/b;
    	}
    	catch(Exception e) {
    		log.error("Problem in Divide");
    				
    	}
		return "Welcome clover Result="+Integer.toString(c)  ;
    
    }
    
    @GetMapping("/getAll")
    public List<Employee> getAllEmloyee() {
        return empService.getAllEmployee();
    }

    @GetMapping("/getbyid/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
        return empService.getEmployeeById(id);
    }

    @PutMapping("/updatebyid/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return empService.updatedEmployee(id,employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        empService.deleteEmployee(id);
        return "Employee deleted successfully!";
	
	
	
        
	

}
}





