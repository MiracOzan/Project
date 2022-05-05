package com.School.DataAccess;

import com.School.Entities.Students;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class StudentsDal implements IStudentsDal {

    private EntityManager entityManager;


    public StudentsDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    @Override
    @Transactional
    public List<Students> GetAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Students> Students = session.createQuery("from students").getResultList();
        return Students;
    }

    @Override
    public void Add(Students students) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(students);
    }

    @Override
    public void Update(Students students) {

    }

    @Override
    public void Delete(Students students) {

    }

    @Override
    public Students GetbyID(int Id) {
        Session session = entityManager.unwrap(Session.class);
        Students students = session.get(Students.class, Id);
        return students;
    }
}
