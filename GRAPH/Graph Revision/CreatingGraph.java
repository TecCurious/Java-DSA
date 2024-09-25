    import java.util.*;
    public class CreatingGraph {

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


        public static void bfs(ArrayList<Edge> [] graph,int v){

            Queue<Integer> q = new LinkedList<>();
            boolean []vis = new boolean[v];

            q.add(0);

            while (!q.isEmpty()) {
                int curr = q.remove();

                if(!vis[curr]){
                    System.out.print(curr+" ");
                    vis[curr] = true;
                    for(int i=0; i<graph[curr].size(); i++){
                        Edge e = graph[curr].get(i);
                        q.add(e.dest);
                    }

                }
            }
        }
        
        public static void dfs(ArrayList<Edge> graph[], int curr,boolean vis[]){
            System.out.print(curr+" ");
            vis[curr] = true;

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                if(!vis[e.dest]){
                    dfs(graph, e.dest, vis);
                }
            }

        }

        public static boolean hasPath(ArrayList<Edge> graph[], int src , int dest, boolean vis[]){

            if(src == dest){
                return true;
            }
            vis[src] = true;

            for(int i=0; i<graph[src].size(); i++){
                Edge e = graph[src].get(i);

                if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis) ){
                    return true;
                }
            }

            return false;
        }

            public static void DFS(ArrayList<Edge> graph[] ){
               boolean vis[] = new boolean[graph.length];

               for(int i=0; i<graph.length; i++){
                if(!vis[i]){
                    DFSutil(graph,i,vis);
                }
               }
            } 

            public static void DFSutil(ArrayList<Edge> graph[],int curr,boolean vis[]){

                System.out.print(curr+" ");
                vis[curr] = true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);

                    if(!vis[e.dest]){
                        
                        DFSutil(graph, e.dest, vis);
                    }
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
            int v = 6;
        ArrayList<Edge> graph [] = new ArrayList[v];
            /*     2
                2----4
            0  1  /  \   
            5  \  /    \  1
                1------3
            */


            for(int i=0; i<v; i++){
                graph[i] = new ArrayList<>();
            }
            // vertex 0
            // graph[0].add(new Edge(0, 1, 5));
            
            // vertex 1
            graph[1].add(new Edge(1, 0, 5));
            graph[1].add(new Edge(1, 2, 1));
            graph[1].add(new Edge(1, 3, 3));


            // vertex 2
            graph[2].add(new Edge(2, 1, 1));
            graph[2].add(new Edge(2, 3, 1));
            graph[2].add(new Edge(2, 4, 2));

            //vertex 3 
            graph[3].add(new Edge(3, 1, 3));
            graph[3].add(new Edge(3, 2, 1));

            //vertex 4
            graph[4].add(new Edge(4, 2, 2));
            graph[5].add(new Edge(5, 0, 1));

            // 2s neibour
            // for(int i=0; i<graph[2].size(); i++){
            //     System.out.println(graph[2].get(i).dest);
            // }

            // bfs(graph, v);

            //  boolean vis[] = new boolean[v];
            // //  dfs(graph, 0, vis);
            // System.out.println(hasPath(graph, 1, 5, vis));

            // DFS(graph);
            System.out.println(detectCycle(graph));
        }
    }