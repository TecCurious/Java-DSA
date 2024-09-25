import java.util.*;
class AlianDictionary {
    public static class Edge{
        int src;
        int dest;
        
        Edge(int s, int d){
            src = s;
            dest = d;
        }
    }
    public static String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        
        ArrayList<Edge> graph[] = new ArrayList[K];
        
        for(int i=0; i<K; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i=0; i<N-1; i++){
            String s1 = dict[i];
            String s2 = dict[i+1];
            
            int len = Math.min(s1.length(), s2.length());
            
            for(int j=0; j<len; j++){
                if(s1.charAt(j) != s2.charAt(j)){
                    graph[s1.charAt(j) - 'a'].add(new Edge(s1.charAt(j) - 'a', s2.charAt(j) - 'a'));
                    break;
                }
            }
        }
        
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[K];
        
        for(int i=0; i<K; i++){
            
            if(!vis[i]){
                topoSort(graph, vis,s,i);
            }
        }
        
        StringBuilder ans = new StringBuilder();
        
       while(!s.isEmpty()){
            ans = ans.append((char)(s.pop() + (int)'a'));
            
        }
        
        
        return ans.toString();
        
    }
    
    public static void topoSort(ArrayList<Edge> graph[],boolean vis[], Stack<Integer> s, int curr){
        
        vis[curr] = true;
        
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            
            if(!vis[e.dest]){
                topoSort(graph,vis,s,e.dest);
            }
        }
        s.push(curr);
        
    }

    public static void main(String[] args) {
        String dict[] = {"baa","abcd","abca","cab","cad"};
        int N = 5;
        int K = 4;

        System.out.println(findOrder(dict, N, K));

    }
}