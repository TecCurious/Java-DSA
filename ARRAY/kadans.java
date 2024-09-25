public class kadans {
    public static void KadansSum(int number[]){
int cs = 0;
int cs2=0;
int ms= Integer.MIN_VALUE;
int mi = Integer.MIN_VALUE;
// int count = 0; 
// for(int i=0; i<number.length; i++){
//     // cs2 = cs2+number[i];
//     if(number[i]<0){
//         count++;

// }
// }

// if(count==number.length){
//     for(int i=0; i<number.length; i++){

    
//    mi = Math.max(mi, number[i]);
//     }

//     }

// System.out.println(mi);

for(int i=0; i<number.length; i++){
    cs = cs+number[i];
    if(cs<0){
        cs=0;
    }
    ms = Math.max(ms, cs);
}
System.out.println("max sum "+ms);
    }
    public static void main(String args[]){
int number[]={2,4,6,8};
KadansSum(number);

    }
}
