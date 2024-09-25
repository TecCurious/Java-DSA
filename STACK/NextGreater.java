import java.util.Stack;
public class NextGreater {
    public static void nextGreater(int arr[], int ngreater[]){
        // reating a stack which is hold the right side greater value
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0 ; i--){// traverse reversly all tghe array
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){// chekking right grater
                s.pop();
            }

            if(s.isEmpty()){// if right grater is not exist in  the array
                ngreater[i] = -1;
            }else{
                ngreater[i] = arr[s.peek()];
            }
            // insting the cuurent value in the stack
            s.push(i);

        }
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int ngreater[] = new int[arr.length];

        nextGreater(arr , ngreater);

        // peint nextGrater array (ans)
        for(int i=0; i<ngreater.length; i++){
            System.out.print(ngreater[i]+" ");
        }
        System.out.println();

    }
}
