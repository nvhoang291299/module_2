package exam.managerCodegym.repository.impl;

import exam.managerCodegym.model.Teacher;
import exam.managerCodegym.repository.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private static List<Teacher> teacherList = new ArrayList<>();
    static {
        teacherList.add(new Teacher(1, "hoang1", "02/01/2000", true, "frontend"));
        teacherList.add(new Teacher(2, "hoang2", "02/01/2000", true, "frontend"));
        teacherList.add(new Teacher(3, "hoang3", "02/01/2000", true, "frontend"));
        teacherList.add(new Teacher(4, "hoang4", "02/01/2000", true, "frontend"));
    }
    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void createTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public void deleteTeacher(int deleteId) {
        teacherList.remove(deleteId);
    }
}
