public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.brith();
        shark.fins=6;
    }
}
// base claaa or parent class
class Animal {
    void eats(){
        System.out.println("eats");
    }

    void brith(){
        System.out.println("briths");
    }
}
// drived class or child class
class Fish extends Animal{
    int fins;

    void swims(){
        System.out.println("fish swims in the water");
    }
}