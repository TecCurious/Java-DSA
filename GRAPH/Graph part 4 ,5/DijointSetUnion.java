public class DijointSetUnion {
   static int n = 7;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for(int i=0; i<n; i++){
            par[i] = i;
        }
    }

    public static int find(int x){
        if(x == par[x]){
            return x;
        }

        return par[x] = find(par[x]); // Path compression -> it reduce the time of next time finding x parernt;
    }

    public static void union(int A, int B){
        int parA = find(A);
        int parB = find(B);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        } else if(rank[parA] > rank[parB]){
            par[parB] = parA;
        }else {
            par[parA] = parB;
        }
    }

    public static void main(String[] args) {
        init();
        System.out.println(find(3));
        union(1, 3);
       System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println( find(3));
        System.out.println( find(4));
        union(1, 5);

    }
}
