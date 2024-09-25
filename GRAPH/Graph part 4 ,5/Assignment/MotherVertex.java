import java.util.*;
public class MotherVertex {

    public static class Edge{
        int src;
        int dest;
        
        public Edge(int s, int d){
            src = s;
            dest = d;
        }
    }


    public static void createGraph(ArrayList<Edge> graph[]){

        int v = graph.length;

        for(int i=0; i<v; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));


    }

    public static void dfsUtil(ArrayList<Edge> graph[], boolean vis[],int curr){

        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph, vis, e.dest);
            }
        }
    }

    public static int motherVertex(ArrayList<Edge> graph[]){
        int v = graph.length;
        boolean vis[] = new boolean[v];

        int mv = -1;

        // finding vertex which traverse all vertex
        for(int i=0; i<v; i++){
            if(!vis[i]){
                dfsUtil(graph, vis, i);
                mv = i;
            }
        }


        // cheking mv to traverse all the graph or not
        vis= new boolean[v];
        dfsUtil(graph, vis, mv);
        for(int i=0; i<v; i++){
            if(!vis[i]){
                return -1;
            }
        }
        return mv;
    }
    public static void main(String[] args) {
        int  v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        System.out.println(motherVertex(graph));
    }
}