import java.util.*;
public class CycleByFindUnion {

    public static class Edge {
        int src;
        int dest;

        Edge(int s, int d){
            src = s; 
            dest = d;
        }
    }

    public static int find(int par[], int x){
        if(x == par[x]){
            return x;
        }

        return find(par, par[x]);
  
    }

    public static void union(int par[],int x, int y){
        par[x] = y;
    }

    public static boolean findCycle(ArrayList<Edge> edges,int V, int E){
        int par[] = new int[V];

        for(int i=0; i<V; i++){
            par[i] = i;
        }

        for(int i=0; i<E; i++){
           Edge e =  edges.get(i);
            int src = find(par, e.src);
            int dest = find(par, e.dest);

            if(src == dest){
                return true;
            }

            union(par, src, dest);
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge> edges = new ArrayList<>();
        int e = 4, v =5;
        edges.add(new Edge(0, 1));
        edges.add(new Edge(1, 2));
        edges.add(new Edge(2, 3));
        edges.add(new Edge(3, 4));
        edges.add(new Edge(4, 2));


        System.out.println(findCycle(edges, v, e));
    }
}
