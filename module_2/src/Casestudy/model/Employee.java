package Casestudy.model;

public class Employee extends Person{
    private int idEmployee;
    private String degree;
    private int salary;
    private String deparment;
    private final String receptionist = "Lễ tân";
    private final String waiter = "Phục vụ";

    private final String specialist = "Chuyên viên";

    private final String supervisor = "Giám sát";

    private final String manager = "Quản lý";

    private final String director = "Giám đốc";
    private final String intermediate = "Intermediate";
    private final String college = "College";
    private final String undergraduate  = "Undergraduate";
    private final String graduate = "Graduate";

    public Employee(int idEmployee, String fullName, String dateOfBirth, String gender,
                    int identityCard, int phoneNumber, String email,
                     String degree,  String deparment, int salary) {
        super(fullName, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.degree = degree;
        this.salary = salary;
        this.deparment = deparment;
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

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    public String getCollege() {
        return college;
    }
}
