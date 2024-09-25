public class PrintDecriseNum{
public static void printDec(int n){
    // base case 1
    if(n == 1){
        System.out.print(n);
        return;
    }
    System.out.print(n+" ");
    printDec(n-1);
}

public static void printInc(int n){
    if(n == 1){
        System.out.print(n);
        return;
    }
    printInc(n-1);
    System.out.print(n+" ");
}

    public static void main(String[] args) {
        // printDec(10);
        printInc(10);
    }
}