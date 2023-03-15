package Casestudy.service.impl;

import Casestudy.repository.IFacilityRepository;
import Casestudy.repository.impl.FacilityRepository;
import Casestudy.repository.impl.VillaRepository;
import Casestudy.service.IFacilityService;
import Casestudy.service.IVillaRepository;
import Casestudy.service.IVillaService;

import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private IFacilityRepository iFacilityRepository = new FacilityRepository();
    private IVillaService iVillaService = new VillaService();
    Scanner sc = new Scanner(System.in);
    @Override
    public void addFacility() {
        System.out.println("chọn dịch vụ mới: \n" +
                "1. Add new villa \n" +
                "2. Add new house \n" +
                "3. Add new room \n" +
                "4. Back to menu \n" +
                "============================");
        System.out.print("Chọn loại dịch vụ: ");
        byte choice = Byte.parseByte(sc.nextLine());
        do {
            switch (choice) {
                case 1:
                    iVillaService.addService();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } while(choice != 4);
    }
}
