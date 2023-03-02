package exam.managerCodegym.controller;

import exam.managerCodegym.service.ITeacherService;
import exam.managerCodegym.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private ITeacherService iTeacherService = new TeacherService();
    int choice;
    public void menuTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Đây là danh sách quản lý giảng viên");
        System.out.println("Các chức năng : ");
        System.out.println("1. Thêm giảng viên ");
        System.out.println("2. Xóa giảng viên ");
        System.out.println("3. Xem danh sách giảng viên ");
        System.out.println("4. Thoát");
        System.out.println("===============================");
        do {
            System.out.println("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.deleteTeacher();
                    break;
                case 3:
                    iTeacherService.displayAll();
                    break;
            }
        } while (choice >= 1 && choice <= 3);
    }
}
