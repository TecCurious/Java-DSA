public class HierarchialInheritance {
    public static void main(String[] args) {
        Bird crow = new Bird();

        crow.breath();
    }
}

class Animal{
    void eats(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breath");
    }

}

class Bird extends Animal{
void fly(){
    System.out.println("birds fly in the sky");
}
}

class Fish {
    void swim(){
        System.out.println("fish swims in the water");
    }
}

class Mamal {
    void walk(){
        System.out.println("mamls can walk");
    }
}