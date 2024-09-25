public class MultipleInheritance {
    public static void main(String[] args) {
        FoodList fl = new FoodList();

        fl.VeagiterianFood();
        fl.carnivoreFood();
    }
}

interface Harbivore {
    void VeagiterianFood();
        
    
}

interface Canrnivore{
    void carnivoreFood();
}

class FoodList implements Harbivore, Canrnivore{
    public void VeagiterianFood(){
        System.out.println(" grass ,vegitable , fruits etc");
    }

     public void carnivoreFood(){
        System.out.println("meat , animal etc");
    }
}