import java.util.*;
public class Alphabate {


    public static void smallestString(int N, int K){

        char arr[] = new char[N];

        Arrays.fill(arr, 'a');
       
        for(int i=N-1; i>=0; i--){

             K -= N-1;

            if(K>= 26){
                arr[i] = 'z';
                K-= 26;
            } else {
                arr[i] = (char)(96+K);
                break;
            }

            K+= i;

        }

        for(int i=0; i<N; i++){
            System.out.print(arr[i]);
        }

    }
    public static void main(String[] args) {
        int N = 3;
        int k= 25;
        smallestString(N, k);
    }
}