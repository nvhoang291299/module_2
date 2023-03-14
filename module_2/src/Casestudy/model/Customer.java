package Casestudy.model;

public class Customer extends Person{
    private int idCustomer;
    private String addressOfCustomer;
    private String typeOfCustomer;
    private final String diamond = "diamond";
    private final String platinium = "platinium";
    private final String gold = "gold";
    private final String silver = "silver";
    private final String member = "member";

    public Customer(int idCustomer, String fullName, String dateOfBirth, String gender, int identityCard,
                    int phoneNumber, String email, String typeOfCustomer, String addressOfCustomer) {
        super(fullName, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.addressOfCustomer = addressOfCustomer;
        this.typeOfCustomer = typeOfCustomer;
    }

    public int getIdCustomer() {
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

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", addressOfCustomer='" + addressOfCustomer + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                super.toString()+
                '}';
    }

    public String toCSV(){
        return getIdCustomer() + "," + super.getFullName() + "," + super.getDateOfBirth() + "," +
                super.isGender() + "," + super.getIdentityCard() + "," + super.getPhoneNumber()+ "," +
                super.getEmail() + "," + getTypeOfCustomer() + "," + getAddressOfCustomer();
    }
}
