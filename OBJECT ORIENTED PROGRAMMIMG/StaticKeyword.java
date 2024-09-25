public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "juji";
        System.out.println(s1.schoolName);

        Student s2 = new Student();
        System.out.println(s2.schoolName);
        Student s3 = new Student();
        s3.schoolName = "MMH";
        System.out.println(s2.schoolName);
    }
}

class Student {

    static int calculateParcentage(int phy , int che, int math){
        return (phy + che +  math)/3;

        
    }
    String name;
    int roll;
static String schoolName;

void seter(String name){
    this.name = name;
}
String geter(){
    return this.name;
}
}