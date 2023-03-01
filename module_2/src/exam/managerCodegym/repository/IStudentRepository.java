package exam.managerCodegym.repository;

import exam.managerCodegym.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();
    void createStudent(Student student);
    void deleteStudent(int deleteId);
}
