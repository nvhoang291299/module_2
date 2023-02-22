package SS5_AM_static.practice.static_method;

public class Student {
    private int id;
    private String name;
    private static byte age;
    Student(int i, String n) {
        id = i;
        name = n;
    }
    static void change() {
        age = 23;
    }
    void display() {
        System.out.println(id + " " + name + " " + age);
    }
}
