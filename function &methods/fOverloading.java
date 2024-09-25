public class fOverloading {
// sum of integer
    public static int sum(int a, int b){
        return a+b;
    }
    // public static int sum(int a, int b, int c){
    //     return a+b+c;
    // }
// sum of float
public static float sum(float a, float b){
    return a+b;
}
    public static void main(String args[]){
System.out.println(sum(5,6));
System.out.println(sum(5.5f,5.6f));
    }
}
