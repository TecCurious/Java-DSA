public class largestString {
    public static void largestr(String array[]){
        String largest = array[0];
        for(int i=1; i<array.length; i++){
            if(largest.compareTo(array[i])<0){
                largest=array[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"};
largestr(fruits);
    }
}
