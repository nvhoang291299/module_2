package Casestudy.service.impl;

import Casestudy.model.House;
import Casestudy.model.Villa;
import Casestudy.repository.IHouseRepository;
import Casestudy.repository.IVillaRepository;
import Casestudy.repository.impl.HouseRepository;
import Casestudy.repository.impl.VillaRepository;
import Casestudy.service.IHouseService;

import java.util.Scanner;

public class HouseService implements IHouseService {
    Scanner sc = new Scanner(System.in);
    private IHouseRepository iHouseRepository = new HouseRepository();
    @Override
    public void addService() {
        System.out.println("Tên dịch vụ:");
        String nameService = sc.nextLine();
        System.out.println("Diện tích sử dụng:");
        float area = Float.parseFloat(sc.nextLine());
        System.out.println("Chi phí thuê:");
        double cost = Double.parseDouble(sc.nextLine());
        System.out.println("Số lượng người:");
        int amount = Integer.parseInt(sc.nextLine());
        System.out.println("Kiểu thuê:");
        String rental = sc.nextLine();
        System.out.println("Tiêu chuẩn phòng:");
        String roomStandard = sc.nextLine();
        System.out.println("Số tầng:");
        byte floors = Byte.parseByte(sc.nextLine());
        System.out.println("nhập mã dịch vụ:");
        int id = Integer.parseInt(sc.nextLine());
        House house = new House(nameService, area, cost, amount, rental, roomStandard, floors, id);
        iHouseRepository.createHouse(house);
    }
}
