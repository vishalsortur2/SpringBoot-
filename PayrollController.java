package com.jts.rest_api.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class PayrollController {
    
    @GetMapping("/getEmpDetails")
    public String getEmpDetails() {
        return "This is get Method";
    }
    
    @PostMapping("/save")
    public String postEmpDetails(){
        return  "This is post Method";
    }

}
