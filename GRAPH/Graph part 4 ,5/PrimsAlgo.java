import java.util.*;
public class PrimsAlgo {

    public static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w){
            src =s;
            dest = d;
            wt = w;
        }

    }

    public static void buildGraph(ArrayList<Edge> graph []){

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1,10));
        graph[0].add(new Edge(0, 2,15));
        graph[0].add(new Edge(0, 3,30));


        graph[1].add(new Edge(1,3,40));
        graph[1].add(new Edge(1,0,10));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,2,40));
        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));

     
        
    }

    public static class Pair implements Comparable<Pair>{
        int v;
        int wt;

        Pair(int v, int wt){
            this.v = v;
            this.wt = wt;
        }

        @Override
        
        public int compareTo(Pair p2){
            return this.wt - p2.wt;
        }
    }

    public static int prims(ArrayList<Edge> graph []){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int cost = 0;
        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if(!vis[curr.v]){
                vis[curr.v] = true;
                cost += curr.wt;

                for(int i=0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }

        return cost;

    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph [] = new ArrayList[v];

        buildGraph(graph);
        System.out.println(prims(graph));


    }
}
