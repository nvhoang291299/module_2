package Casestudy.model;

public abstract class Facility {
    private String nameService;
    private float area;
    private double cost;
    private int maxNumOfPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String nameService, float area, Double cost, int maxNumOfPeople, String rentalType) {
        this.nameService = nameService;
        this.area = area;
        this.cost = cost;
        this.maxNumOfPeople = maxNumOfPeople;
        this.rentalType = rentalType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public int getMaxNumOfPeople() {
        return maxNumOfPeople;
    }

    public void setMaxNumOfPeople(int maxNumOfPeople) {
        this.maxNumOfPeople = maxNumOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", maxNumOfPeople=" + maxNumOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
    public String toCSV(){
        return getNameService() + "," + getArea() + "," + getCost() + "," + getMaxNumOfPeople() + "," + getRentalType();
    }
}
