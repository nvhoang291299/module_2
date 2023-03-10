package exam.managerCodegym.controller;

import exam.managerCodegym.service.IStudentService;
import exam.managerCodegym.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private IStudentService iStudentService = new StudentService();
    int choice;
    public void menuStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Đây là danh sách quản lý học viên");
        System.out.println("Các chức năng : ");
        System.out.println("1. Thêm học viên ");
        System.out.println("2. Xóa học viên ");
        System.out.println("3. Xem danh sách học viên ");
        System.out.println("4. Tìm kiếm  học viên ");
        System.out.println("5. Thoát");
        System.out.println("===============================");
        do {
            System.out.println("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.deleteStudent();
                    break;
                case 3:
                    iStudentService.displayAll();
                    break;
                case 4:
                    iStudentService.searchStudent();
                    break;
            }
        } while (choice >= 1 && choice <= 4);
    }
}
