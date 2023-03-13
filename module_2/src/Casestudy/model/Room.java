package Casestudy.model;

public class Room extends Facility{
    private String freeService;

    public Room(String nameService, Double area, Double cost, int maxNumOfPeople,
                String rentalType, String freeService) {
        super(nameService, area, cost, maxNumOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
