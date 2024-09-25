public class halfP {


    // function for 0-1 hlaf pyramid
    public static void Half0P(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // for row
    //     int n = 4;
    //     for (int i = 1; i <= n; i++) {
    //         // for space
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    //         for(int k=1; k<=i; k++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }


    // for(int i=1; i<=5; i++){
    //     for(int j=1; j<=5-i+1; j++ ){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

// floyds  pyramid
// int num=0;
// for(int i=0; i<=5; i++){
//     for(int j=1; j<=i; j++){
//       ++num;
//         System.out.print(num);
//     }
//     System.out.println();
// }

// function calling for 0-1 half pyramid
Half0P(5); 

    }
}
