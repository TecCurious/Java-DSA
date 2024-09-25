public class Question {
    public static void main(String[] args) {
        
        for(int i=-10; i<20000; i++){
            if(i%2 != 0){
                int n = (i-1)/2;
                    if((n-1)*2 == n+1){
                        System.out.println(i);
                    }
                }
            }
        }
    }
