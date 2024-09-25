public class MethodeoverRiding {
    public static void main(String[] args) {
        Animal dog = new Animal();

       dog.eat();

        Deer d = new Deer();
        d.eat();

        
    }
}

class Animal{
    void eat(){
        System.out.println("eats anything");
    }

    void breath(){
        System.out.println("Animal cam breath");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats only grash");
    }
}