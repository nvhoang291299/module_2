package Casestudy.controller;

import Casestudy.service.IEmployeeService;
import Casestudy.service.impl.EmployeeService;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("chức năng menu: \n" +
                "1. Employee Management \n" +
                "2. Customer Management \n" +
                "3. Facility Management \n" +
                "4. Booking Management \n" +
                "5. Promotion Management \n" +
                "6. Exit");
        byte choice;
        do {
            System.out.print("chọn chức năng: ");
            choice = Byte.parseByte(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Employee Management: \n" +
                            "1. Display list employees \n" +
                            "2. Add new employee \n" +
                            "3. Edit employee \n" +
                            "4. Return main menu \n"
                    );
                    IEmployeeService iEmployeeService = new EmployeeService();
                    break;
                case 2:
                    System.out.println("Customer Management: \n" +
                            "1. Display list customers \n" +
                            "2. Add new customer \n" +
                            "3. Edit customer \n" +
                            "4. Return main menu \n"
                    );
                    break;
                case 3:
                    System.out.println("Facility Management: \n" +
                            "1. Display list facility \n" +
                            "2. Add new facility \n" +
                            "3. Display list facility maintenance \n" +
                            "4. Return main menu"
                    );
                    break;
                case 4:
                    System.out.println("Booking Management: \n" +
                            "1. Display list facility \n" +
                            "2. Add new facility \n" +
                            "3. Display list facility maintenance \n" +
                            "4. Return main menu \n"+
                            "5. Edit contracts \n"+
                            "6. Return main menu"
                    );
                    break;
                case 5:
                    System.out.println("Promotion Management: \n" +
                            "1. Display list customers use service \n" +
                            "2. Display list customers get voucher \n" +
                            "3. Return main menu"
                    );
                    break;
                case 6:
                    System.out.println("ban da thoat danh sach");
                    break;
            }
        } while (choice > 0 && choice < 6);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
