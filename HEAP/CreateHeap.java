import java.util.*;

public class CreateHeap {

static class Heap {
    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data){
        // step 1 add in the last
        arr.add(data);
        
        int x = arr.size()-1;// child index
        int par  = (x-1)/2;// parent index

        while (arr.get(x) < arr.get(par)) {
            // sawap
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);
            x = par;
            par = (x-1)/2;
        }
    }

    public int peek(){
        return arr.get(0);
    }

    private void hipify(int i){
        int minIdx = i;
        int left = 2*i+1;
        int right = 2*i+2;

        // chek for left elment 
        if(left <arr.size() && arr.get(minIdx) > arr.get(left)){
            minIdx = left;
        }

        // cheking for right element 
        if(right <arr.size() && arr.get(minIdx) > arr.get(right)){
            minIdx = right;
        }

        // cheking heap is already fipify or not
        if(minIdx != i){
            // swap i and minIdx
            int temp = arr.get(i);
            arr.set(i, arr.get(minIdx));
            arr.set(minIdx, temp);

            hipify(minIdx);
        }


    }

    //remove root element from Heap
    public int remove(){
        int data = arr.get(0);

        // step 1 - swap firtst and last element 
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size()-1));
        arr.set(arr.size()-1, temp);

        // step 2 - delete last element 
        arr. remove(arr.size()-1);

        // step 3 - Hipify
        hipify(0);

        return data;
    }
    // is empty function
    public boolean isEmpty(){
        return arr.size() == 0;
    }
   
}

    public static void main(String[] args) {
        Heap hp = new Heap();

        hp.add(2);
        hp.add(3);
        hp.add(4);
        hp.add(5);
        hp.add(10);
        hp.add(1);

        // hp.printHeap();
        System.out.println();
        // System.out.println(hp.peek());
        // System.out.println(hp.remove());

        while (!hp.isEmpty()) {
            System.out.print(hp.peek()+" ");
            hp.remove();
        }
        
    }
}
