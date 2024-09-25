import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatoreExa {
    public static void main(String[] args) {
         ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("prakash", 21, 2));
        list.add(new Student("aaksh", 20, 1));
        list.add(new Student("vikash", 226, 10));
        list.add(new Student("ravi", 23, 3));
        
        Collections.sort(list,new  nameComparatore());
        
       for (Student student : list) {
        System.out.println("name:"+student.name+" " +"age:"+ student.age+" "+"is:"+student.id);
       }
    }
}

class Student  {
    String name ;
    int age;
    int id;

    

    Student(String name, int age , int id){
        this.name = name;
        this.age = age;
        this.id = id;

    }

}

class IdComparator implements Comparator<Student>{

  public int compare(Student obj, Student obj2){

    return obj.id - obj2.id;
   }


}


class nameComparatore implements Comparator<Student>{
    public int compare(Student obj1, Student obj2){
        return  obj1.name.compareTo(obj2.name);
    }
}

