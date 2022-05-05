package com.School.DataAccess;
import com.School.Entities.Students;
import javax.persistence.EntityManager;
import java.util.List;

public class StudentsDal implements IStudentsDal {

    private EntityManager entityManager;

    @Autowired
    public StudentsDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    @Override
    public List<Students> GetAll() {
        return null;
    }

    @Override
    public void Add(Students students) {

    }

    @Override
    public void Update(Students students) {

    }

    @Override
    public void Delete(Students students) {

    }
}
