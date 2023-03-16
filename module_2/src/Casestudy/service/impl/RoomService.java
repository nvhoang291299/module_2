package Casestudy.service.impl;

import Casestudy.model.Room;
import Casestudy.repository.IRoomRepository;
import Casestudy.repository.impl.RoomRepository;
import Casestudy.service.IRoomService;

import java.util.Scanner;

public class RoomService implements IRoomService {
    Scanner sc = new Scanner(System.in);
    private IRoomRepository iRoomRepository = new RoomRepository();
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
            System.out.println("Dịch vụ free:");
            String serviceFree = sc.nextLine();
            byte floors = Byte.parseByte(sc.nextLine());
            System.out.println("nhập mã dịch vụ:");
            int id = Integer.parseInt(sc.nextLine());
            Room room = new Room(nameService, area, cost, amount, rental, serviceFree, id);
            iRoomRepository.createRoom(room);
    }
}
