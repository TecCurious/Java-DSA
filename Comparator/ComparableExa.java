import java.util.*;
import java.io.*;
import java.text.CollationElementIterator;



public class ComparableExa{

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("prakash", 21, 2));
        list.add(new Student("aaksh", 20, 1));
        list.add(new Student("vikash", 226, 10));
        list.add(new Student("ravi", 23, 3));
        
        Collections.sort(list);
        
       for (Student student : list) {
        System.out.println("name:"+student.name+" " +"age:"+ student.age+" "+"is:"+student.id);
       }
    }
}

class Student implements Comparable<Student> {
    String name ;
    int age;
    int id;

    public int compareTo(Student s){
        return this.name.compareTo(s.name);
    }

    Student(String name, int age , int id){
        this.name = name;
        this.age = age;
        this.id = id;

    }

   
}
