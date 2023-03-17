package Casestudy.service.impl;

import Casestudy.model.House;
import Casestudy.repository.IHouseRepository;
import Casestudy.repository.impl.HouseRepository;
import Casestudy.service.IHouseService;
import Casestudy.validate.UserException;
import Casestudy.validate.Validate;

import java.util.Scanner;

public class HouseService implements IHouseService {
    Scanner sc = new Scanner(System.in);
    private IHouseRepository iHouseRepository = new HouseRepository();
    Validate validate = new Validate();
    @Override
    public void addService() {
        System.out.println("Tên dịch vụ:");
        String nameService = sc.nextLine();
        while (!validate.validate(nameService)){
            System.out.println("Nhập lại tên dịch vụ:");
            nameService = sc.nextLine();
        }
        System.out.println("Diện tích sử dụng:");
        float area = Float.parseFloat(sc.nextLine());
        while(area < 30.0){
            try {
                System.out.println("nhập lại diện tích sử dụng:");
                area = Float.parseFloat(sc.nextLine());
                throw new UserException("giá trị bạn nhập vào lớn hơn 30");
            } catch (UserException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("số bạn nhập phải là số thực");
            }
        }
        System.out.println("Chi phí thuê:");
        double cost = Double.parseDouble(sc.nextLine());
        while(cost <= 0){
            try {
                System.out.println("nhập lại chi phí thuê:");
                cost = Double.parseDouble(sc.nextLine());
                throw new UserException("giá trị bạn cần nhâp vào là số dương");
            } catch (UserException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("số bạn nhập phải là số thực");
            }
        }
        System.out.println("Số lượng người:");
        int amount = Integer.parseInt(sc.nextLine());
        while(amount < 0 || amount > 20){
            try {
                System.out.println("nhập lại số lượng:");
                amount = Integer.parseInt(sc.nextLine());
                throw new UserException("số lượng bạn nhập lớn hơn 20");
            } catch (UserException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("số bạn nhập phải là số dương");
            }
        }
        System.out.println("Kiểu thuê:");
        String rental = sc.nextLine();
        while (!validate.validate(rental)){
            System.out.println("Nhập lại kiểu thuê:");
            rental = sc.nextLine();
        }
        System.out.println("Tiêu chuẩn phòng:");
        String roomStandard = sc.nextLine();
        while (!validate.validate(roomStandard)){
            System.out.println("Nhập tiêu chuẩn phòng:");
            roomStandard = sc.nextLine();
        }
        System.out.println("Số tầng:");
        byte floors = Byte.parseByte(sc.nextLine());
        while(floors < 0){
            try {
                System.out.println("nhập lại số tầng:");
                floors = Byte.parseByte(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Số tầng là số nguyên dương");
            }
        }
        System.out.println("nhập mã dịch vụ:");
        String codeService = sc.nextLine();
        while(!validate.validate(codeService)){
            System.out.println("nhập lại mã dịch vụ:");
            codeService = sc.nextLine();
        }
        House house = new House(nameService, area, cost, amount, rental, roomStandard, floors, codeService);
        iHouseRepository.createHouse(house);
    }
}
