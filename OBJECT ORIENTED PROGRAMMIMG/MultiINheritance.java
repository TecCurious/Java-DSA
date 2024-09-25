public class MultiINheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();

        dobby.lgs=5;
        dobby.breath();
        System.out.println(dobby.lgs);
    }
}

class Animal {
    void eats(){
        System.out.println("eats");

    }
    void breath(){
        System.out.println("breaths");
    }
}

class Mamal extends Animal {
    int lgs;
}

class Dog extends Mamal {
    String bread;
}