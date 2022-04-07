package Entity;

import Core.IEntity;

public class Students implements IEntity {
    private String StudentsName;
    private String StudentsLastName;






    public String getStudentsName() {
        return StudentsName;
    }

    public void setStudentsName(String studentsName) {
        StudentsName = studentsName;
    }

    public String getStudentsLastName() {
        return StudentsLastName;
    }

    public void setStudentsLastName(String studentsLastName) {
        StudentsLastName = studentsLastName;
    }
}
