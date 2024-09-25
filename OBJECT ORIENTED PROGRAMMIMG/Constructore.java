public class Constructore {
    public static void main(String[] args) {
        Student s1 = new Student("prakash");
        System.out.println(s1.name);
    }
}

class Student{
    String name;
    int roll;

    // constructore
    Student(String name){
        this.name = name;
        System.out.println("constratore is called");
    }
}