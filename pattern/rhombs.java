public class rhombs {
    public static void main(String args[]){
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=n-1; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
          int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=n-1; k++){
                if(i==1 || i==5 ||k==1|| k==4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
