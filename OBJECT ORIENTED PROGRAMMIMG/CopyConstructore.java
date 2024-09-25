public class CopyConstructore {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="prakash";
        s1.password="abc";
        s1.roll = 22;
     s1.marks[0]=79;
     s1.marks[1]=88;
     s1.marks[2]=95;


        Student s2 = new Student(s1);
        s2.password="xyz";
      System.out.println(s2.name); 
      s1.marks[2]=99;
      
      for(int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
      }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

// shallow copy contructore
    // Student(Student s1){
    //      marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // deep copy construntore
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll=s1.roll;
        for(int i=0; i<3; i++){
            this.marks[i]=s1.marks[i];
        }

    }
    Student(){
         marks = new int[3];
        System.out.println("contructore is called");
    }
    
}