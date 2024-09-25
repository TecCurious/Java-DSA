import java.util.*;
public class CycleByBFS {
    public static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            src = s;
            dest = d;
        }
    }

    public static void buildGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2, 5));

        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 6));

        graph[5].add(new Edge(5, 7));

        // graph[6].add(new Edge(6, 7));

    }

    public static class Pair{
        int n;
        int pare;

        Pair(int n, int pare){
            this.n = n;
            this.pare = pare;
        }
    }
    public static boolean isCycleBFS(ArrayList<Edge> graph[]){
        Queue<Pair> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];

         q.add(new Pair(1, -1));
        vis[1] = true;
        while (!q.isEmpty()) {
            Pair curr = q.remove();

            

            for(int i=0; i<graph[curr.n].size(); i++){
                Edge e = graph[curr.n].get(i);

                if(!vis[e.dest]){
                    q.add(new Pair(e.dest, curr.n));
                    vis[e.dest] = true;
                }else {
                    if(e.dest != curr.pare){
                        return true;
                    }
                }

            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        int v = 8;
        ArrayList<Edge> graph [] = new ArrayList[v];

        buildGraph(graph);
        System.out.println(isCycleBFS(graph));
        

    }
}