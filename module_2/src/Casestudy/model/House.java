package Casestudy.model;

public class House extends Facility{
    private String roomStandard;
    private byte numOfFloors;

    public House(String nameService, float area, double cost, int maxNumOfPeople,
                String rentalType, String roomStandard, byte numOfFloors) {
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

    public byte getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(Byte numOfFloors) {
        this.numOfFloors = numOfFloors;
    }
}
