import java.util.ArrayList;

public class LolneyNumber {

    public static boolean isLonely(ArrayList<Integer> list, int indx, int num){
        
        for(int i=0; i<list.size(); i++){
            if(i==indx){
                continue;
            }
            // case 1
            if(list.get(i)==num){
                return false;
            }

            // case 2
            if(list.get(i)==num-1){
                return false;
            }

            // case 3
            if(list.get(i)==num+1){
                return false;
            }

        }

        return true;
    }

    public static ArrayList<Integer> lonely(ArrayList<Integer> list){
        // ans arrayList
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(isLonely(list, i, list.get(i))){
                ans.add(list.get(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);

        System.out.println(lonely(list));

    }
}
