import java.util.*;
public class TopologicalSorting {
    public static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            src = s;
            dest = d;
        }
    }


    public static void topSort(ArrayList<Edge> graph[]){

        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++) {
            if(!vis[i]){
                topSortUtil(graph,i,vis,s); // modified dfs
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
     }

     public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);

     }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];

        for(int i=0; i<v; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));


        topSort(graph);
    }
}
