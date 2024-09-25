public class Reverse {
    // reebsrse a array
    public static void reverseA(int number[]){
        int n = number.length;
        for(int i=0; i<n/2; i++){
            int temp =number[n-(i+1)];
           
            number[n-(i+1)]=number[i];
            number[i] = temp;
        }
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10};
        reverseA(number);

        for(int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }


    }
}
