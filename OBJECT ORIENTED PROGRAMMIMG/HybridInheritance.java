public class HybridInheritance {
    public static void main(String[] args) {
        Animal db = new Animal();
        db.breath();
        Mamal ml = new Mamal();
        
    }
}

class Animal{
    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("fish swims in the water");
    }
}

class Bird extends Animal {
    void fly(){
        System.out.println("birds fly in the sky");
    }
}

class Mamals extends Animal{
    int legs;
}

class Tune extends Fish{
    void size(){
        System.out.println("tune is a small fish");
    }
}

class shark extends Fish {
    void Size(){
        System.out.println("shark size is big");
    }
}

class Peacock extends Bird{
    void looks(){
        System.out.println("peacock is a beautifull bird");
    }
}

class Dog extends Mamal{
String bread;
}

class Cat extends Mamal{
    void mil(){
        System.out.println("cad drinks milk");
    }
}

class Human extends Mamal{
    void walk(){
        System.out.println("humans wilks");
    }
}
