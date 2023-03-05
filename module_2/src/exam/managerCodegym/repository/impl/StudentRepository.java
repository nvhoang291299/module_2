package exam.managerCodegym.repository.impl;

import exam.managerCodegym.model.Student;
import exam.managerCodegym.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1, "hoang", "02/01/2000", true, "C1222G1", 9));
        studentList.add(new Student(2, "hoang1", "02/01/2000", true, "C1222G1", 9.1));
        studentList.add(new Student(3, "hoang2", "02/01/2000", true, "C1222G1", 9.2));
        studentList.add(new Student(4, "hoang3", "02/01/2000", true, "C1222G1", 9.3));
    }
    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public void createStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void deleteStudent(int deleteId) {
        studentList.remove(deleteId);
    }

    @Override
    public boolean searchStudent(String searchStudent) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equals(searchStudent)) {
                return true;
            }
        }
        System.out.println("tên không tồn tại");
        return false;
    }
}
