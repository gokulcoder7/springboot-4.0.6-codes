package com.gokul.restdao_120;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;




@Repository
public class DAOiml implements EmployeeDAO{


    EntityManager myem;



    public DAOiml(EntityManager them){
        myem=them;

    }

    @Override
    public List<Employee> findall() {


        TypedQuery<Employee> teq= myem.createQuery("From Employee ", Employee.class);
        List<Employee> li=teq.getResultList();



        return li;
    }
}
