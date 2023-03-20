package Casestudy.service.impl;

import Casestudy.repository.IFacilityRepository;
//import Casestudy.repository.impl.FacilityRepository;
import Casestudy.service.IFacilityService;
import Casestudy.service.IHouseService;
import Casestudy.service.IRoomService;
import Casestudy.service.IVillaService;

import java.util.*;

public class FacilityService implements IFacilityService {
    private IVillaService iVillaService = new VillaService();
    private IHouseService iHouseService = new HouseService();
    private IRoomService iRoomService = new RoomService();
    Scanner sc = new Scanner(System.in);

    @Override
    public void displayFacility() {
        iVillaService.displayService();
        iHouseService.displayService();
        iRoomService.displayService();
    }

    @Override
    public void addFacility() {
        System.out.println("chọn dịch vụ mới: \n" +
                "1. Add new villa \n" +
                "2. Add new house \n" +
                "3. Add new room \n" +
                "4. Back to menu \n" +
                "============================");
        byte choice;
        do {
            System.out.print("Chọn loại dịch vụ: ");
             choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    iVillaService.addService();
                    break;
                case 2:
                    iHouseService.addService();
                    break;
                case 3:
                    iRoomService.addService();
                    break;
                case 4:
                    break;
            }
        } while(choice > 0 && choice < 4);
    }
}
