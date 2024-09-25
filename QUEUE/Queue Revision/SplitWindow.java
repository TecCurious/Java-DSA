import java.util.*;
public class SplitWindow {
    public static void printMax(int arr[], int k){
        Deque<Integer> dq = new LinkedList<>();
        // first window
        int i;
        for(i=0; i<k; ++i){
            while(!dq.isEmpty() && arr[i]> arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);

        }

        for(; i<arr.length; ++i){
            System.out.print(arr[dq.peekFirst()]+" ");

            // rempve element which is out of window
            while(!dq.isEmpty() && dq.peek()<= i-k ){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && arr[i]> arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.println(arr[dq.peekFirst()]);
    }
     
    public static void main(String[] args) {
        int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
        int k = 3;

        printMax(arr, k);
    }
}
