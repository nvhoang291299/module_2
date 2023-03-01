package exam.managerCodegym.service.impl;

import exam.managerCodegym.model.Student;
import exam.managerCodegym.repository.IStudentRepository;
import exam.managerCodegym.repository.impl.StudentRepository;
import exam.managerCodegym.service.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner sc = new Scanner(System.in);
    private IStudentRepository iStudentRepository = new StudentRepository();
    List<Student> list = iStudentRepository.getAll();

    @Override
    public void displayAll() {
        if (list.size() == 0){
            System.out.println("danh sách trống");
        } else {
            for (Student temp: list) {
                System.out.println(temp);
            }
        }
    }

    @Override
    public void addStudent() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = sc.nextLine();
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
        System.out.print("Nhập lớp: ");
        String classes = sc.nextLine();
        System.out.print("Nhập điểm: ");
        float point = Float.parseFloat(sc.nextLine());
        Student student = new Student(id, name, dateOfBirth, gender, classes, point);
        iStudentRepository.createStudent(student);
    }

    @Override
    public void deleteStudent() {
        System.out.println("nhập mã mà bạn muốn xóa");
        int deleteId = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (deleteId == list.get(i).getId()){
                iStudentRepository.deleteStudent(i);
            } else {
                System.out.println("địa chỉ id mà bạn muốn xóa không tồn tại");
            }
        }
        System.out.println(list);
    }
}
