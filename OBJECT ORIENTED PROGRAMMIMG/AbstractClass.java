public class AbstractClass {
    public static void main(String[] args) {
        
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.colorChange();
        System.out.println(h.color);
        Chiken c = new Chiken();
        c.eat();
        c.walk();
        System.out.println(c.color);

        Mustang ms = new Mustang();
    }
}
// abstract class and base class so we can mote create Animal class object
abstract class Animal {
    String color;
    //constructore
    Animal(){
        System.out.println("Animal constructore called");
        color = "brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}

// horse class child class of Abstract Animal class
class Horse extends Animal{
    Horse(){
         System.out.println("Horse constructore called");
    }
    void colorChange(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }

}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructire called");
    }
}

// Chiken class child class of Abstract Animal class
class Chiken extends Animal{
    Chiken(){
         System.out.println("Chiken constructore called");
    }
    void colorChange(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}