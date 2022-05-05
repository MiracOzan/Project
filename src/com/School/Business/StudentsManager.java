package com.School.Business;

import com.School.DataAccess.IStudentsDal;
import com.School.Entities.Students;

import javax.transaction.Transactional;
import java.util.List;


public class StudentsManager implements IStudentsService {
    private IStudentsDal studentsDal;

    public StudentsManager(IStudentsDal studentsDal) {
        this.studentsDal = studentsDal;
    }

    @Override
    @Transactional
    public List<Students> GetAll() {
        return this.studentsDal.GetAll();
    }

    @Override
    public void Add(Students students) {
        this.studentsDal.Add(students);
    }

    @Override
    public void Update(Students students) {
        this.studentsDal.Update(students);
    }

    @Override
    public void Delete(Students students) {
        this.studentsDal.Delete(students);
    }

    @Override
    public Students GetbuId(int Id) {
        return this.studentsDal.GetbyID(Id);
    }
}
