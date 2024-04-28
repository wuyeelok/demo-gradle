package com.thinkcon.demogradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeApi {

    @GetMapping("/{empId}")
    public String getEmployee(@PathVariable String empId){
        return "Employee Found: " + empId;
    }

}
