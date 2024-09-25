public class DigitTostring {
    public static void digitTostr(String arr[],int number){
        // base case
    if(number==0){
        return;
    }
    int lastdigit = number%10;

    digitTostr(arr, number/10);
    System.out.println(arr[lastdigit]+" ");

    }
    public static void main(String[] args) {
    String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    digitTostr(arr, 123448377);
    }
}
