import java.util.*;

public class JobSequencing {

    public static void  printJobSequencing(ArrayList<Job> list){
Collections.sort(list, Collections.reverseOrder(Comparator.comparingDouble(o ->o.profit)));

        int max = 0;

        for(int i=0; i<list.size(); i++){
            max = Math.max(max, list.get(i).deadlin);
        }

        int map[] = new int[max+1];


        for(int i=0; i<list.size(); i++){
            if(map[list.get(i).deadlin] == 0){
                map[list.get(i).deadlin]=1;
                System.out.print(list.get(i).id+" ");
            }
        }

        
    }


    public static void main(String[] args) {
        ArrayList<Job> list = new ArrayList<>();

        list.add(new Job('a', 4, 20));
        list.add(new Job('b', 1, 10));
        list.add(new Job('c', 1, 40));
        list.add(new Job('d', 1, 30));

        printJobSequencing(list);

    }
}

class Job{
    char id;
    int deadlin;
    int profit;

    Job(char id, int deadlin, int profit){
        this.id = id;
        this.deadlin = deadlin;
        this.profit = profit;
    }

}