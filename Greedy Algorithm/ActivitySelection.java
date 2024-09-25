import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1, 3 ,2 ,5};
        int end[]  = {2, 4, 3 ,6};


        // if end time array is note sorted

        int activity[][] = new int[end.length][3];

        for(int i=0; i<end.length; i++){
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }

        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        int actMax = 1;

        ans.add(activity[0][0]);
        int lastend = activity[0][2];

        for(int i=1; i<end.length; i++){
            if(lastend < activity[i][1]){{
                actMax++;
                lastend = activity[i][2];
                ans.add(activity[i][0]);
            }

            }
        }

// print answer
System.out.println("Actmax="+actMax);
for(int i=0; i<ans.size(); i++){
    System.out.print("A"+ans.get(i)+" ");
}
}
}