package exam.managerCodegym.view;

import exam.managerCodegym.controller.StudentController;
import exam.managerCodegym.controller.TeacherController;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choice;
        do {
            System.out.print("Nhập thông tin mà bạn muốn: ");
            choice = Byte.parseByte(sc.nextLine());
            if (choice == 1) {
                new StudentController().menuStudent();
            } else if (choice == 2){
                new TeacherController().menuTeacher();
            } else {
                System.out.println("số bạn vừa nhập không tồn tại");
            }
        } while (choice != 1 && choice != 2);
    }
}
