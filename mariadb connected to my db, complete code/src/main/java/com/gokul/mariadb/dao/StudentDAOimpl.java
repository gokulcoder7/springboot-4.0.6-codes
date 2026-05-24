package com.gokul.mariadb.dao;

import com.gokul.mariadb.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOimpl implements StudentDAO{

    private EntityManager em;

    public StudentDAOimpl(EntityManager em) {
        this.em = em;
    }
    @Transactional
    @Override
    public void save(Student st) {
        em.persist(st);
//        em.persi

    }
}
