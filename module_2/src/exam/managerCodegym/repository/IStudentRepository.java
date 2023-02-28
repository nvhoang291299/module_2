package exam.managerCodegym.repository;

import exam.managerCodegym.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();
    List<Student> createStudent();
}
