import java.util.*;
public class ConnectedCities {

    public static class Edge  implements Comparable<Edge>{
        int dest;
        int cost;

        Edge(int d, int c){
            dest = d;
            cost = c;
        }

        @Override
        public int compareTo(Edge e2){
            return this.cost - e2.cost;
        }
    }

    public static int connectCities( int cities[][]){
        int n = cities[0].length;
        PriorityQueue<Edge> pq = new PriorityQueue<>();

        boolean vis[] = new boolean[n];
        int totalCost = 0;
        pq.add(new Edge(0, 0));

        while (!pq.isEmpty()) {
            Edge curr = pq.remove();

            if(!vis[curr.dest]){
                vis[curr.dest] = true;
                totalCost += curr.cost;

                for(int i=0; i<n; i++){
                    if(cities[curr.dest][i] != 0){
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }

        return totalCost;
    }
    public static void main(String[] args) {

        int cities[][] = {{0,1,2,3,4}, 
                          {1,0,5,0,7},
                          {2,5,0,6,0},
                          {3,0,6,0,0},
                          {4,7,0,0,0}};

        System.out.println(connectCities(cities));
    }
}
