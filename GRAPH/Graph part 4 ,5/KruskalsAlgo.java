import java.util.*;
public class KruskalsAlgo {

    public static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;

        Edge(int s, int d,int w){
            src = s;
            dest = d;
            wt = w;
        }

        @Override
        public int compareTo(Edge e2){
            return this.wt - e2.wt;
        }
    }

    public static void crateGraph(ArrayList<Edge> edges){
        
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    // Disjoint set
    static int n = 4;
    static int  par[] = new int[n];
    static int rank[] = new int[n];

    public static void ini(){
        for(int i=0; i<n; i++){
            par[i] = i;
        }
    }

    // find
    public static int find(int x){
        if(x == par[x]){
            return x;
        }

        return par[x] = find(par[x]);
    }


    // union
    public static void union(int A, int B){

        int parA = find(A);
        int parB = find(B);

        if(rank[parA] == rank[parB]){
            par[parB]  = parA;
            rank[parA]++;
        }else  if(rank[parA] > rank[parB]){
            par[parB] = parA;
        }else {
            par[parA] = parB;
        }

        
    }

    // Kruskal algorithm
    public static int kruskalMST(ArrayList<Edge> edges, int v){
        ini();
        crateGraph(edges);
        Collections.sort(edges);

        int mstCost = 0;
        int count = 0;

        for(int i=0; count<v-1; i++){
            Edge e = edges.get(i);
            

            // chek not make cycle
            int src = find(e.src);
            int dest = find(e.dest);
            if(src != dest){
                count++;
                mstCost+= e.wt;
                
                // to ensure thaat we taken this edge
                union(src, dest);
            }

        }
        return mstCost;
    }
    public static void main(String[] args) {
        ArrayList<Edge> edges = new ArrayList<>();
        int v = 4;
       System.out.println( kruskalMST(edges, v));
    }
}
