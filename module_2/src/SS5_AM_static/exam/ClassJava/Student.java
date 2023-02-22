package SS5_AM_static.exam.ClassJava;

public class Student {
    private String name= "John";
    private String classes = "C02";
    Student(){}
    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String classes){
        this.classes =classes;
    }

    @Override
    public String toString() {
        return "Tên: "+ this.name + ". Lớp: " + this.classes;
    }
}
