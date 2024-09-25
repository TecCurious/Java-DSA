import java.util.*;

public class SlindingWindow {
    public static void printMax(int arr[], int k){
        Deque<Integer> dq = new LinkedList<>();

        // store max value of first window of array in dque
        int i;
        for(i = 0; i<k; ++i){
            while(!dq.isEmpty() && arr[i]>= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        // for rest of the windows
        for( ; i<arr.length; ++i){

            //print max value of the window
            System.out.print(arr[dq.peekFirst()] + " ");

            // removing element which is out of the window
            while(!dq.isEmpty() && dq.peek() <= i-k){
                dq.removeFirst();
            }

             // store max value of first window of array in dque

             while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
             }

             dq.addLast(i);

        }
        System.out.print(arr[dq.peek()]);
    }

    public static void main(String[] args) {
        int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
int k = 3;

printMax(arr, k);
    }
}
