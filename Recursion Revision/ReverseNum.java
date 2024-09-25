class ReverseNum {
    public static void  reverseNum(int n){
        // base case 
        if(n==0){
            
            return;
        }

        // kam 
              System.out.println(n);

       reverseNum(n-1);
    }
    public static void main(String[] args) {
        reverseNum(10);
    }
}