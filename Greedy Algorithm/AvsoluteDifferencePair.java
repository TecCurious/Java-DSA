import java.util.Arrays;

public class AvsoluteDifferencePair {
    public static void main(String[] args) {
        int A[] = {4,1,8,7};
            int B[] = {2,3,6,5};

            // sort both array

            Arrays.sort(A);
            Arrays.sort(B);

            int minDefference = 0;
            for(int i=0; i<A.length; i++){
                minDefference += Math.abs(A[i]-B[i]);
            }

    System.out.println("minimum Absolute value is:"+minDefference);
    }
}
