package com.gokul.restdao_120;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class restcontroller {

    private EmployeeDAO dao;

    public restcontroller(EmployeeDAO tdao) {
        dao = tdao;
    }

    @GetMapping("/employees")
    public List<Employee> finda(){
        return dao.findall();
    }



}
