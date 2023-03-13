package Casestudy.model;

public abstract class Facility {
    private String nameService;
    private double area;
    private double cost;
    private int maxNumOfPeople;
    private String RentalType;

    public Facility() {
    }

    public Facility(String nameService, Double area, Double cost, int maxNumOfPeople, String rentalType) {
        this.nameService = nameService;
        this.area = area;
        this.cost = cost;
        this.maxNumOfPeople = maxNumOfPeople;
        RentalType = rentalType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
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
        return RentalType;
    }

    public void setRentalType(String rentalType) {
        RentalType = rentalType;
    }
}
