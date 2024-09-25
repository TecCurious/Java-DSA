import java.util.*;
public class KosarajuAlgo {
    public static class Edge{
        int src;
        int dest;

        Edge(int s , int d){
            src = s;
            dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));

        
    }

    public static void topSort(ArrayList<Edge> graph[] , Stack<Integer> s,boolean vis[] ,int curr){

        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                topSort(graph, s, vis, e.dest);
            }
        }

        s.push(curr);
    }

   

    public static void dfs(ArrayList<Edge> graph[] ,boolean vis[] ,int curr){

        vis[curr] = true;
        System.out.print(curr+" ");

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, vis, e.dest);
            }
        }

        
    }

    public static void kosaraju(ArrayList<Edge> graph[] , int V){
        
        // step1
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];

        for(int i=0; i<V; i++){
            if(!vis[i]){
                topSort(graph, s, vis, i);
            }
        }


        //step2 transpose graph
        ArrayList<Edge> trans[] = new ArrayList[V];
        for(int i=0; i<V; i++){
            
            trans[i] = new ArrayList<>();
        }
        

        for(int i=0; i<V; i++){
           for(int j=0; j<graph[i].size(); j++){
            Edge e = graph[i].get(j);

            trans[e.dest].add(new Edge(e.dest, e.src));
           }
        }


        // step 3 
        boolean chek[] = new boolean[V];
        while (!s.isEmpty()) {
                int curr = s.pop();

                if(!chek[curr]){
                    System.out.print("SCC->");
                    dfs(trans, chek, curr);
                    System.out.println();
                }     
            }
        }



    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        kosaraju(graph, v);


    }
}
