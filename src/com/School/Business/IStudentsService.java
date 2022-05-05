package com.School.Business;
import com.School.Entities.Students;
import java.util.List;

public interface IStudentsService {
    List<Students> GetAll();
    void Add (Students students);
    void Update (Students students);
    void Delete (Students students);
    Students GetbuId (int Id);
}
