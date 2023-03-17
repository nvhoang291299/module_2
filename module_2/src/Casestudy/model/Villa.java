package Casestudy.model;

public class Villa extends Facility{
    private String roomStandard;
    private float swimmingpoolArea;
    private byte numOfFloors;
    private String villaId;

    public Villa(String nameService, float area, Double cost, int maxNumOfPeople, String rentalType,
                 String roomStandard, float swimmingpoolArea, byte numOfFloors, String villaId) {
        super(nameService, area, cost, maxNumOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingpoolArea = swimmingpoolArea;
        this.numOfFloors = numOfFloors;
        this.villaId = villaId;
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
