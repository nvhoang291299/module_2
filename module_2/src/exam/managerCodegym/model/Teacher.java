package exam.managerCodegym.model;

public class Teacher extends Person{
    private String specialize;
    public Teacher() {}
    public Teacher(int id, String name, String dateOfBirth, boolean gender, String specialize) {
        super(id, name, dateOfBirth, gender);
        this.specialize = specialize;
    }
}
