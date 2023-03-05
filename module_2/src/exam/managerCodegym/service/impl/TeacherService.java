package exam.managerCodegym.service.impl;

import exam.managerCodegym.model.Student;
import exam.managerCodegym.model.Teacher;
import exam.managerCodegym.repository.ITeacherRepository;
import exam.managerCodegym.repository.impl.TeacherRepository;
import exam.managerCodegym.service.ITeacherService;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    Scanner sc = new Scanner(System.in);
    private ITeacherRepository iTeacherRepository = new TeacherRepository();
    @Override
    public void displayAll() {
        List<Teacher> list = iTeacherRepository.getAll();

        if (list.size() == 0){
            System.out.println("danh sách trống");
        } else {
            for (Teacher temp: list) {
                System.out.println(temp);
            }
        }
    }
    @Override
    public void addTeacher() {
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
        System.out.print("Nhập chuyên ngành: ");
        String specialize = sc.nextLine();
        Teacher teacher = new Teacher(id, name, dateOfBirth, gender, specialize);
        iTeacherRepository.createTeacher(teacher);
    }

    @Override
    public void deleteTeacher() {
        List<Teacher> list = iTeacherRepository.getAll();

        System.out.println("nhập mã mà bạn muốn xóa");
        int deleteId = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (deleteId == list.get(i).getId()){
                System.out.println("Bạn có muốn xóa hay không? (yes/no)");
                String confirm = sc.nextLine();
                if (confirm.equals("yes")){
                    iTeacherRepository.deleteTeacher(i);
                    System.out.println("bạn đã xóa thành công");
                } else {
                    System.out.println("bạn đã xóa thất bại");
                }
                return;
            }
        }
        System.out.println("địa chỉ id mà bạn muốn xóa không tồn tại");
    }
    @Override
    public void searchTeacher() {
        List<Teacher> list = iTeacherRepository.getAll();

        System.out.print("nhập tên tìm kiếm: ");
        String searchName = sc.nextLine();
        boolean confirmName = iTeacherRepository.searchTeacher(searchName);;
        if (confirmName) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().equals(searchName)){
                    System.out.println(list.get(i));
                }
            }
        }
    }
}
