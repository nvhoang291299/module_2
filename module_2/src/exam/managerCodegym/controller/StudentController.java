package exam.managerCodegym.controller;

import exam.managerCodegym.service.IStudentService;
import exam.managerCodegym.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private IStudentService iStudentService = new StudentService();
    byte choice;
    public void menuStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Các chức năng : ");
        System.out.println("1. Thêm học sinh ");
        System.out.println("2. Xóa học sinh ");
        System.out.println("3. Xem danh sách học sinh ");
        System.out.println("4. Thoát");
        System.out.println("===============================");
        System.out.println("Chọn chức năng ");
        do {
            choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.createStudent();
                    break;
                case 2:
                    break;
                case 3:
                    iStudentService.displayAll();
                    break;
                case 4:
                    break;
            }
        } while (choice >= 1 && choice <= 4);
    }
}
