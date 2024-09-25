import java.util.*;
public class ChipestFlight {

    public static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s , int d , int w){
            src = s;
            dest = d;
            wt = w;
        }
    }

    public static class Info {
        int v;
        int cost;
        int stops;

        Info(int ve , int c , int s){
            v = ve;
            cost = c;
            stops = s;
        }
    }

    public static void createGraph(ArrayList<Edge> graph [], int flight[][]){
        
        int n = flight.length;

        for(int i = 0; i<n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<n; i++){
            int src = flight[i][0];
            int dest = flight[i][1];
            int wt = flight[i][2];

        Edge e = new Edge(src, dest, wt);
        graph[src].add(e);
        }


    }

    public static int  chepestFlight(ArrayList<Edge> graph[] , int flight[][], int n ,int src , int dest , int k){

        createGraph(graph, flight);
        int dis[] = new int[n];

        for(int i=0; i<n; i++){
            if(i != src){
                dis[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList();

        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();
            
            if(curr.stops > k){
                break;
            }

            // ralaxtation 
            for(int i=0; i<graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest;
                int w = e.wt;
                if( curr.cost+w < dis[v] && curr.stops <= k ){ // curr.cost -> w have to claculate shortest path source to destination & edge for edge case
                    dis[v] = curr.cost+w;
                    q.add(new Info(v, dis[v], curr.stops+1 ));
                }
            }
            
        }

        if(dis[dest] == Integer.MAX_VALUE){
            return -1;
        }
        return dis[dest];

    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<Edge> graph [] = new ArrayList[n];
      int  flight[][] = {{0,1,100}, {1,2,100}, {2,0,100}, {1,3,600}, {2,3,200}};

      int ans = chepestFlight(graph, flight, n, 0, 3, 1);

      System.out.println(ans);
    }
}