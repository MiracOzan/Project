package com.School.DataAccess;
import com.School.Entities.Students;
import java.util.List;



public interface IStudentsDal {
    List<Students> GetAll();
    void Add (Students students);
    void Update (Students students);
    void Delete (Students students);
}
