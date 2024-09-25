import java.util.*;

public class BelmanFord {

    public static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s,int d,int w){
            src = s;
            dest = d;
            wt = w;
        }
    }   


    public static void buildGraph(ArrayList<Edge> graph []){

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        
        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }


    public static void belmanFord(ArrayList<Edge> graph [] , int src){ // O(V*E)
        // array for store shortest path
        int V = graph.length;
        int dist[] = new int[V];

        // Allocating src dist =0; and other Infinite  
        for(int i=0; i<V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        // algo 
        for(int i=0; i<V-1; i++){ //O(v)
            // finding eges 
            for(int j=0; j<V; j++){ // O(E)
                for(int k=0; k<graph[j].size(); k++){
                    // u , v , wt
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    // relaxation
                    //dist[u] != Integer.MAX_VALUE Becouse ifinitae + somtihng make the negatve value in java
                    if( dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u]+wt;
                    }
                }
            }
        }

        for(int i=0; i<V; i++){
            System.out.print(dist[i]+" ");
        }

        
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph [] = new ArrayList[v];

        buildGraph(graph);
        belmanFord(graph, 0);
    }
}