package Casestudy.model;

public class Room extends Facility{
    private String freeService;
    private String roomId;

    public Room(String nameService, float area, Double cost, int maxNumOfPeople, String rentalType, String freeService, String roomId) {
        super(nameService, area, cost, maxNumOfPeople, rentalType);
        this.freeService = freeService;
        this.roomId = roomId;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
