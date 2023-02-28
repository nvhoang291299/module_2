package SS9_dsa_list.exam.my_list;

public class MyListTest {
    public static class Student{
        private int id;
        private String name;
        public Student() {
        }
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Student st1 = new Student(1,"huy");
        Student st2 = new Student(2,"huy");
        Student st3 = new Student(3,"huy");
        Student st4 = new Student(4,"huy");


        MyList<Student> studentArrList = new MyList<>();
        studentArrList.add(st1);
        studentArrList.add(st2);
        studentArrList.add(st3);
        studentArrList.add(st4);
        for (int i = 0; i < studentArrList.size(); i++) {
            System.out.println(studentArrList.elements[i]);
        }
    }
}
