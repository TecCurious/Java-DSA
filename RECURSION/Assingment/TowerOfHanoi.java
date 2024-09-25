public class TowerOfHanoi {
    public static void towerOfHanoi(int n,String sour, String help , String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+ " from "+sour+" to "+dest);
            return;
        }

        towerOfHanoi(n-1, sour, dest, help);
        System.out.println("Transfer disk "+n+ " from "+sour+" to "+dest);
        towerOfHanoi(n-1, help, sour, dest);
    }
    public static void main(String[] args) {
        towerOfHanoi(3, "S", "H", "D");
    }
}
