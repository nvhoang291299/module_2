package Casestudy.service.impl;

import Casestudy.model.Villa;
import Casestudy.repository.IFacilityRepository;
import Casestudy.repository.impl.FacilityRepository;
import Casestudy.repository.impl.VillaRepository;
import Casestudy.service.IVillaRepository;
import Casestudy.service.IVillaService;

import java.util.Scanner;

public class VillaService implements IVillaService {
    Scanner sc = new Scanner(System.in);
    private IFacilityRepository iFacilityRepository = new FacilityRepository();
    private IVillaRepository iVillaRepository = new VillaRepository();
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
        System.out.println("Diện tích hồ bơi:");
        float areaSwimming = Float.parseFloat(sc.nextLine());
        System.out.println("Số tầng:");
        byte floors = Byte.parseByte(sc.nextLine());
        Villa villa = new Villa(nameService, area, cost, amount, rental, roomStandard, areaSwimming, floors);
        iVillaRepository.createVilla(villa);
    }
}
