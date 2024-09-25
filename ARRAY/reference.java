public class reference {
    public static int Update(int marks[],int unchangable){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
        unchangable = unchangable+6;
         return unchangable;
    }
   
    public static void main(String args []){
        int marks[] = {96,97,98};
       int  unchangable = 6;
        Update(marks,unchangable);
        System.out.println(Update(marks,unchangable));
        System.out.println(unchangable);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]);
        }
        System.out.println();
        
    }
}
