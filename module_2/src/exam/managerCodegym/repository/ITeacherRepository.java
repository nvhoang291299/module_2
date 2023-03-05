package exam.managerCodegym.repository;

import exam.managerCodegym.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public interface ITeacherRepository {

    List<Teacher> getAll();
    void createTeacher(Teacher teacher);
    void deleteTeacher(int deleteId);
    boolean searchTeacher(String searchName);
}
