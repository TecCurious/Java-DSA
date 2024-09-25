import java.util.*;
public class KahnsAlgo {

    public static class Edge {
        int src;
        int dest;

        public Edge(int s, int d){
            src = s; 
            dest = d;
        }
    }   

        public static void calcInDeg(ArrayList<Edge> graph[], int indeg[]){

            for(int i=0; i<graph.length; i++){
                int v = i;
                for(int j=0; j<graph[v].size(); j++){
                    Edge e = graph[v].get(j);

                    indeg[e.dest]++;
                }
            }
        }
        public static void topSort(ArrayList<Edge> graph[]){
            int indeg[] = new int[graph.length];
            Queue<Integer> q = new LinkedList<>();
            calcInDeg(graph, indeg);

            for(int i=0; i<indeg.length; i++){
                if(indeg[i] == 0){
                    q.add(i);
                }
            }
                //BFS
                for(int i=0; i<graph.length; i++){

                    while (!q.isEmpty()) {
                        int curr = q.remove();
                        System.out.print(curr+" ");

                        for(int j=0; j<graph[curr].size(); j++){
                            Edge e = graph[curr].get(j);
                            indeg[e.dest]--;
                            if(indeg[e.dest] == 0){
                                q.add(e.dest);
                            }
                        
                        }
                    }
                }

            
            
        }

    public static void BuilddGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
             graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];

        BuilddGraph(graph);
        topSort(graph);
    }
}
