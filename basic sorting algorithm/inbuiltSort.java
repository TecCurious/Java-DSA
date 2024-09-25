import java.util.Arrays;
import java.util.Collections;
public class inbuiltSort {
   


// function for print array
public static void PrintAaray(Integer arr[]){
    for( int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
}


     public static void main(String[] args) {
        Integer arr[] = {5,4,1,3,2};
    //accending order
    // Arrays.sort(arr);

    // 0-n index 
    // Arrays.sort(arr,0,3);
        PrintAaray(arr);

        // decending order
        // Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        
    }
}

