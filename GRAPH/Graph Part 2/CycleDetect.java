import java.util.*;
public class CycleDetect {

    public static class Edge {
        int src;
        int dest;
        int wt;


        public Edge(int src,int dest,int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }


    public static boolean detectCycle(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];

        for(int i =0; i<graph.length; i++){
            if(!vis[i]){
              return  detectCycleUtil(graph,vis,i,-1);
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[],boolean vis[],int curr, int par){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            //case 3 neighbour not visited
            if(!vis[e.dest] ){
                if(detectCycleUtil(graph, vis, e.dest, curr)){
                    return true;
                }
                    
            } // case 1
            else if(vis[e.dest] && e.dest != par){
                return true;
            }
            // case 2 do Nothing
        }

        return false;
        
    }

    public static void main(String[] args) {
        
    }
}