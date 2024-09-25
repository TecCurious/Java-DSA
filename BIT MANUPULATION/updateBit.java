public class updateBit {
    public static int ClearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    public static int  SetIthBit(int n, int i){

        int bitmask = 1<<i;
        return n|bitmask;
    }

    public static int UpdateBit(int newbit,int n,int i){
    //     int value;
    //     if( u==0){
    //       value =  ClearIthBit(n, i);
    //     }
    //     else{
    //      value =   SetIthBit(n, i);
    //     }
    //     return value;
    
   n= ClearIthBit(n, i);
    int bitmask = newbit<<i;
    return n|bitmask;
    }
    public static void main(String[] args) {
       System.out.println(UpdateBit(1, 10, 2)); 
    }
}
