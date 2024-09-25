import java.util.*;

public class IsCycle {
    static class Edge{
       int src;
       int dest;
       
       public Edge(int s, int d){
           src = s; 
           dest = d;
       }
   }
   
   
   public static boolean isPossible(int N,int P,int[][] prerequisites){
       // Your Code goes herei
      
      ArrayList<Edge> graph [] = new ArrayList[N];
       boolean vis[] = new boolean[N];
       
       for(int i=0; i<N; i++){
           graph[i] = new ArrayList<>();
       }
      
      boolean Stack[] = new boolean[N];
      for(int i=0; i<P; i++){
          graph[prerequisites[i][1]].add(new Edge(prerequisites[i][1],prerequisites[i][0]));
      }
      
      
         for(int i=0; i<N; i++){
             if(!vis[i]){
             if(isCycle(graph,vis,Stack,i)){
                 return false;
             }
             }
         }
       return true;
      
   }
   
   public static boolean isCycle(ArrayList<Edge> graph[], boolean vis[], boolean Stack[] , int curr){
       
       vis[curr] = true;
       Stack[curr] = true;
       
       for(int i=0; i<graph[curr].size(); i++){
           Edge e = graph[curr].get(i);
           
           if(!vis[e.dest]){
              if(isCycle(graph,vis,Stack,e.dest)){
                  return true;
              }
           }
              if(Stack[e.dest]){
                  return true;
              }
              
       }
       
       Stack[curr] = false;
       
       return false;
       
       }
       public static void main(String[] args) {
        int N = 4;
        int P = 3;

        int prerequisites[][] = {{1,0,}, {2,1},{3,2}};

       System.out.println( isPossible(N, P, prerequisites));
       }
    }
       
