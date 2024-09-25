public class Largest {
    // largest number in an arry
    public static int GetLargest(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest<number[i]){
                largest = number[i];
            }
            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println("smallest number is :"+smallest);
        return largest;
    }
    public static void main(String args[]){
        int number[] = {1,5,7,9,3,6};

        System.out.println("lagest value is :"+GetLargest(number));
    }
}
