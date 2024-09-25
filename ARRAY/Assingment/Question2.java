package Assingment;

public class Question2 {
    public static void rotatearray(int num[],int t){
        // randon number between 0 to length of the array
        // int randomNum = (int)(Math.random() * num.length);

        // for rotate
        for(int i=0; i<num.length; i++){
            num[i]=num[t];
            if(t==num.length-1){
                t=0;
            }
            t++;
        }
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }

    }
    public static void main(String args[]){
        int num[] = {1,2,3,4,5};
        int t = 3;
        rotatearray(num, t);
        
    }
}
