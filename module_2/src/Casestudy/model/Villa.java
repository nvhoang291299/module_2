package Casestudy.model;

public class Villa extends Facility{
    private String roomStandard;
    private float swimmingpoolArea;
    private byte numOfFloors;

    public Villa(String nameService, Float area, Double cost, int maxNumOfPeople, String rentalType,
                 String roomStandard, Float swimmingpoolArea, Byte numOfFloors) {
        super(nameService, area, cost, maxNumOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingpoolArea = swimmingpoolArea;
        this.numOfFloors = numOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Float getSwimmingpoolArea() {
        return swimmingpoolArea;
    }

    public void setSwimmingpoolArea(Float swimmingpoolArea) {
        this.swimmingpoolArea = swimmingpoolArea;
    }

    public Byte getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(Byte numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingpoolArea=" + swimmingpoolArea +
                ", numOfFloors=" + numOfFloors +
                '}';
    }
    public String toCSV(){
        return super.toCSV() + "," + getRoomStandard() + "," + getSwimmingpoolArea() + "," + getNumOfFloors();
    }
}
