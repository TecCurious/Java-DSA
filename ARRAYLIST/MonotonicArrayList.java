import java.util.ArrayList;
public class MonotonicArrayList {

    public static boolean mootonic(ArrayList<Integer> list){
        boolean inc = true;
        boolean des = true;
        
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)>list.get(i+1))
                inc = false;
            if(list.get(i)<list.get(i+1))
                des = false;
        }    
        
        
        return inc || des ;
    }
    
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        // list.add(3);

        System.out.println(mootonic(list)); 
    }
}
