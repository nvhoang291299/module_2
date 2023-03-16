package Casestudy.controller;

import Casestudy.service.ICustomerService;
import Casestudy.service.IEmployeeService;
import Casestudy.service.IFacilityService;
import Casestudy.service.impl.CustomerService;
import Casestudy.service.impl.EmployeeService;
import Casestudy.service.impl.FacilityService;

import java.util.Scanner;

public class FuramaController {
    private static IEmployeeService iEmployeeService = new EmployeeService();
    private static ICustomerService iCustomerService = new CustomerService();
    private static IFacilityService iFacilityService = new FacilityService();

    public static void displayMainMenu() {
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
            switch (choice) {
                case 1:

                    System.out.println("Employee Management: \n" +
                            "1. Display list employees \n" +
                            "2. Add new employee \n" +
                            "3. Edit employee \n" +
                            "4. Return main menu \n"
                    );
                    byte choice1;
                    do{
                        System.out.print("Enter your choice: ");
                        choice1 = Byte.parseByte(sc.nextLine());
                        switch (choice1){
                            case 1:
                                iEmployeeService.displayEmployees();
                                break;
                            case 2:
                                iEmployeeService.addEmployee();
                                break;
                            case 3:
                                iEmployeeService.editEmployee();
                                break;
                            case 4:
                                displayMainMenu();
                                break;
                        }
                    } while (choice1 > 0 && choice1 < 4);
                    break;
                case 2:
                    System.out.println("Customer Management: \n" +
                            "1. Display list customers \n" +
                            "2. Add new customer \n" +
                            "3. Edit customer \n" +
                            "4. Return main menu \n"
                    );
                    byte choice2;
                    do{
                        System.out.print("Enter your choice: ");
                        choice2 = Byte.parseByte(sc.nextLine());
                        switch (choice2){
                            case 1:
                                iCustomerService.display();
                                break;
                            case 2:
                                iCustomerService.add();
                                break;
                            case 3:
                                iCustomerService.edit();
                                break;
                            case 4:
                                displayMainMenu();
                                break;
                        }
                    } while (choice2 > 0 && choice2 < 4);
                    break;
                case 3:
                    System.out.println("Facility Management: \n" +
                            "1. Display list facility \n" +
                            "2. Add new facility \n" +
                            "3. Display list facility maintenance \n" +
                            "4. Return main menu"
                    );
                    byte choice3;
                    do{
                        System.out.print("Enter your choice: ");
                        choice3 = Byte.parseByte(sc.nextLine());
                        switch (choice3){
                            case 1:
                                iFacilityService.displayFacility();
                                break;
                            case 2:
                                iFacilityService.addFacility();
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    } while (choice3 > 0 && choice3 < 4);
                    break;
                case 4:
                    System.out.println("Booking Management: \n" +
                            "1. Display list facility \n" +
                            "2. Add new facility \n" +
                            "3. Display list facility maintenance \n" +
                            "4. Return main menu \n" +
                            "5. Edit contracts \n" +
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
        } while (choice > 0 && choice < 5);
    }
    public static void main(String[] args) {
        new FuramaController().displayMainMenu();
    }
}
