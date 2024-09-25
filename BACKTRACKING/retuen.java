public class retuen {
    public static void ret(int n){
        if(n<5){
            System.out.println(n);
            
        }
        else{
            for(int i=0; i<4; i++){
                ret(i);
            }
        }
    }
    public static void main(String[] args) {
        ret(6);
        
        System.out.println("prakash");


       int arr[]= new int[6];

    for(int i=0; i<7; i++){
        System.out.print(arr[i]+"");
    }
    }

    
}
