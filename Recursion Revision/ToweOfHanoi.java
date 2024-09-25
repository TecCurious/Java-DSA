public class ToweOfHanoi {
    public static void hanoi(int n, String s,String h,String d){
        // base case 
        if(n==1){
            System.out.println("disc tranfered "+n+" from"+s+ " to destination "+d);
            return;
        }

        // n-1 to helper 
        hanoi(n-1, s, d, h);
         System.out.println("disc tranfered "+n+" from"+s+ " to destination "+d);
        
        //n-1 helper to destinattioncls
        hanoi(n-1, h, s, d);


    }
    public static void main(String[] args) {
        hanoi(3, "A", "B", "C");
    }
}
