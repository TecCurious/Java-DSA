import java.util.*;
public class TarjanBridge {

    public static class Edge{
        int src;
        int dest;

        Edge(int s, int d){
            src = s;
            dest = d;
        }

  
    }



    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));

        
    }

    public static void dfs(ArrayList<Edge> graph[], boolean vis[],int par, int dt[], int low[],int time, int curr){

        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(e.dest == par){
                continue;
            } else if(!vis[e.dest]){
                dfs(graph, vis, curr, dt, low, time, e.dest);

                low[curr] = Math.min(low[curr], low[e.dest]);
                if(dt[curr] < low[e.dest]){
                    System.out.println("Bridge"+ curr + " ----- " + e.dest);
                }
            } else{
                low[curr] = Math.min(low[curr], dt[e.dest]);
            }
        }
    }



    public static void tarjanBridge(ArrayList<Edge> graph[], int V){

        int dt[] = new int[V];
        int low[] = new int[V];
        boolean vis[] = new boolean[V];

        int par = -1;
        int time = 0;
        
        for(int i=0; i<V; i++){
            if(!vis[i]){
                dfs(graph, vis, par, dt, low, time, i);
            }
        }

    }


    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        tarjanBridge(graph, V);
    }
}
