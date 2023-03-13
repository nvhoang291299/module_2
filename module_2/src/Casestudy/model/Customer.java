package Casestudy.model;

public class Customer extends Person{
    private short idCustomer;
    private String addressOfCustomer;
    private String typeOfCustomer;
    private final String diamond = "diamond";
    private final String platinium = "platinium";
    private final String gold = "gold";
    private final String silver = "silver";
    private final String member = "member";

    public Customer(String fullName, String dateOfBirth, String gender, int identityCard,
                    int phoneNumber, String email, short idCustomer, String addressOfCustomer,
                    String typeOfCustomer) {
        super(fullName, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.addressOfCustomer = addressOfCustomer;
        this.typeOfCustomer = typeOfCustomer;
    }

    public short getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(short idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getAddressOfCustomer() {
        return addressOfCustomer;
    }

    public void setAddressOfCustomer(String addressOfCustomer) {
        this.addressOfCustomer = addressOfCustomer;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }
}
