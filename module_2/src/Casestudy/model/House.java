package Casestudy.model;

public class House extends Facility{
    private String roomStandard;
    private byte numOfFloors;

    public House(String nameService, Double area, Double cost, int maxNumOfPeople,
                String rentalType, String roomStandard, Byte numOfFloors) {
        super(nameService, area, cost, maxNumOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numOfFloors = numOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Byte getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(Byte numOfFloors) {
        this.numOfFloors = numOfFloors;
    }
}
