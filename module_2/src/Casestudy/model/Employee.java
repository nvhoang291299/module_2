package Casestudy.model;

public class Employee extends Person{
    private int idEmployee;
    private String degree;
    private int salary;
    private String department;
    private final String  RECEPTIONIST = "Lễ tân";
    private final String WAITER= "Phục vụ";

    private final String SPECIALIST = "Chuyên viên";

    private final String SUPERVISOR = "Giám sát";

    private final String MANAGER = "Quản lý";

    private final String DIRECTOR = "Giám đốc";
    private final String INTERMEDIATE= "Intermediate";
    private final String COLLEGE = "College";
    private final String UNDERGRADUATE  = "Undergraduate";
    private final String GRADUATE = "Graduate";

    public Employee(int idEmployee, String fullName, String dateOfBirth, String gender,
                    int identityCard, int phoneNumber, String email,
                    String degree, String department, int salary) {
        super(fullName, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.degree = degree;
        this.salary = salary;
        this.department = department;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDeparment(String deparment) {
        this.department = deparment;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", degree='" + degree + '\'' +
                ", deparment='" + department + '\'' +
                super.toString()+
                '}';
    }
    public String toCSV(){
        return getIdEmployee() + "," + super.getFullName() + "," + super.getDateOfBirth() + "," +
                super.isGender() + "," + super.getIdentityCard() + "," + super.getPhoneNumber()+ "," +
                super.getEmail() + "," + getDegree() + "," + getDepartment() + "," + getSalary();
    }
}
