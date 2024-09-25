public class SuperKeyword {
    public static void main(String[] args) {

        
        Horse s = new Horse();
        System.out.println(s.color);

    }
}

class Animal {
    String color;
    Animal(){
        System.out.println("Animal constructore called");
    }
}

class Horse extends Animal{

    Horse(){

        super.color = "brown";
        System.out.println("Horse construcotre called");
    }
}