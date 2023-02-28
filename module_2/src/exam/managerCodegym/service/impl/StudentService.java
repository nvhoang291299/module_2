package exam.managerCodegym.service.impl;

import exam.managerCodegym.model.Student;
import exam.managerCodegym.repository.IStudentRepository;
import exam.managerCodegym.repository.impl.StudentRepository;
import exam.managerCodegym.service.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public void displayAll() {
        List<Student> list = iStudentRepository.getAll();
        if (list.size() == 0){
            System.out.println("danh sách trống");
        } else {
            for (Student temp: list) {
                System.out.println(temp);
            }
        }
    }

    @Override
    public void createStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id: ");
        int id = Integer.getInteger(sc.nextLine());
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = sc.nextLine();
        System.out.print("Nhập lớp: ");
        String classes = sc.nextLine();
        System.out.print("Nhập điểm: ");
        float point = Integer.getInteger(sc.nextLine());
        System.out.print("Nhập giới tính: ");
        String tempGender = sc.nextLine();
        Boolean gender;
        if (tempGender.equals("nam")) {
            gender = true;
        } else if(tempGender.equals("nữ")){
            gender = false;
        } else {
            gender = null;
        }
    }
}
