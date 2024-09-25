import java.util.*;
public class JobSequensing {

    static class Job {
        int Id;
        int profit;
        int deadline;

        Job(int id, int dl, int pt ) {
            Id = id;
            profit = pt;
            deadline = dl;

        }
    }

    public static void main(String[] args) {
        
        int jobInfo[][] = {{4,20} , {1,10}, {1,40}, {1, 30}};
        
    ArrayList<Job> list = new ArrayList<>();
    
    // adding value in objects
    for(int i=0; i<jobInfo.length; i++){
        list.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
    }
    // sort object in decending order by profit
    Collections.sort(list , (obj1 , obj2) -> obj2.profit - obj1.profit);
    

    // hold sequence
    ArrayList<Integer> seq = new ArrayList<>();

    int time =0;

    for(int i=0; i<list.size(); i++){
        Job curr = list.get(i);

        if(curr.deadline > time){
            seq.add(curr.Id);
            time++;
        }
    }


    // print swquence

    System.out.println("num of job="+ seq.size());

    for(int i=0; i<seq.size(); i++){
        System.out.print(seq.get(i)+" ");
    }

    }
}
