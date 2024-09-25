import java.util.ArrayList;
public class BasicsArrayList {

     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        // list.add(1, 0);
        // list.remove(2);
        // list.set(1, 6);

    //    System.out.println(list.contains(5)); 
    //     System.out.println(list.get(3));

        // System.out.println(list);
        

        // array size
     System.out.println(list.size());
     
     //print Arraylist
     for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i)+" ");
     }
System.out.println();

      for(int i=list.size()-1; i>=0; i--){
        System.out.print(list.get(i)+" ");
     }
    }
    
}



