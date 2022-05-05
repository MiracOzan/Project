package com.School.RestApi;

import com.School.Business.IStudentsService;
import com.School.Entities.Students;

import java.util.List;

@RequestMapping("/api")
public class StudentsController {
    private IStudentsService _studentsService;

    @AutoWired
    public StudentsController(IStudentsService _studentsService) {
        this._studentsService = _studentsService;
    }

    public List<Students> get(){
        return _studentsService.GetAll();
    };
}
