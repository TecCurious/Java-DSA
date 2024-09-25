public class CreateMaxMinST {

    static int tree[];

    // initialization
    public static void init(int n){
        tree = new int[4*n];
     }

    public static int buildSt(int arr[],int i, int start, int end) {
        if(start == end){
            tree[i] = arr[start];
            return arr[start];
        }

        int mid = (start + end)/2;
        int left = buildSt(arr, 2*i+1, start, mid);//left max
        int right = buildSt(arr, 2*i+2, mid+1, end);// right max
        tree[i] = Math.max(left, right);
        return tree[i];
    }


    // get max
    public static int getMax(int arr[], int qi, int qj){
        int n = arr.length;
        return getMaxUtil(0, 0, n-1, qi, qj);
    }

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj){
        if(sj < qi || qj < si){ // not overlap
            return Integer.MIN_VALUE;
        } else if(si >= qi && sj <= qj){ // complete overlap
            return tree[i];
        } else {// partial overlap
            int mid = (si+sj)/2;
            int left = getMaxUtil(2*i+1,si, mid, qi, qj);
            int right = getMaxUtil(2*i+2, mid + 1, sj, qi, qj);
            return Math.max(left, right);
        }
    }

    // update
    public static void update(int arr[], int idx, int val){
        arr[idx] = val;
        int n = arr.length;
        updateUtil(0, 0, n-1, idx, val);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int newVal){
        if(idx < si || idx > sj){ // not in range
            return;
        }

        if(si == sj){ // for leaf node
            tree[i] = newVal;
        } else { // non leaf node
            tree[i] = Math.max(tree[i], newVal);
            int mid = (si+sj)/2;
            updateUtil(2*i+1, si, mid, idx, newVal);// left
            updateUtil(2*i+2, mid+1, sj, idx, newVal);// right
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,8,-1,2,17,1,3,2,4};
        int n = arr.length;
        init(n);
        buildSt(arr, 0, 0, n-1);

        // for(int i=0; i<tree.length; i++){
        //     System.out.print(tree[i]+ " ");
        // }
        
        System.out.println(getMax(arr, 2, 5));// 8
        update(arr, 2, 20);
        System.out.println(getMax(arr, 2, 5));
    }
}
