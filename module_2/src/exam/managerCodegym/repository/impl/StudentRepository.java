package exam.managerCodegym.repository.impl;

import exam.managerCodegym.model.Student;
import exam.managerCodegym.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1, "hoang", "02/01/00", true, "C1222G1", 9));
    }
    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public List<Student> createStudent() {
        return null;
    }
}
