import java.util.*;


public class HashMapCode {

    static class HashMap<k ,v> { // genric class

        private class Node {
            k key;
            v value;


        public Node (k key , v value){
            this.key = key;
            this.value = value;
        }
        }


        private int N = 4;
        private int  n = 0;

        private LinkedList<Node> buckets[];
        
        @SuppressWarnings("unchecked")
         HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];

            for(int i=0; i<4; i++){
                buckets[i] = new LinkedList<>();
            }
         }

         private int hashFunction(k key){
            int hc = key.hashCode();

            return Math.abs(hc) % N; // return value between the 0 to N;
         }

         private int searchInLL(k key , int bi) { // searching data index in LinkedList
                LinkedList<Node> ll = buckets[bi];

                
                
                for(int i=0; i<ll.size(); i++){
                    if(ll.get(i).key == key){
                        return i;
                    }
                    
                }

                return -1;
         }
         @SuppressWarnings("unchecked")
         private void reHashing(){ // rehashing the hasmap 
            LinkedList<Node> oldBucket[] = buckets;

            buckets = new LinkedList[2*N];

            for(int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
             
            N = 2*N;
            // add in the bucket
            for(int i=0; i<oldBucket.length; i++ ){
                LinkedList<Node> ll = buckets[i];
                int size = ll.size();
                for(int j=0; j<size; j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                    
                }
            }
         }

         public void put(k key , v value){ // O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key , bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }else {
                buckets[bi].add(new Node(key, value));
            }
            n++;

            double lambda = (double)n/N;
            if(lambda > 2.0){
                reHashing();
            }

         }


         public v get(k key){ //O(1) 
            int bi = hashFunction(key);
            int di = searchInLL(key , bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            }else {
                return null;
            }
         }


         public boolean containsKey(k key){ // O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key , bi);

            if(di != -1){
                return true;
            }else {
                return false;
            }
         }


         public v remove(k key){//O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key , bi);

            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }else {
                return null;
            }
         }


         public boolean isEmpty(){ // O(1);
            if(n != 0){
                return false;
            }else {
                return true;
            }
         }


         public ArrayList<k> keySet(){ // O(n)
            ArrayList<k> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];

                for (Node node : ll) {
                    keys.add(node.key);
                }
            }

            return keys;
         }

    }




    public static void main(String[] args) {
        
        HashMap<String , Integer> hm = new HashMap<>();

        hm.put("India", 150);
        hm.put("Us", 100);
        hm.put("China", 120);
        hm.put("bhutan", 50);
        hm.put("Nepal", 10);

        ArrayList<String> keys = hm.keySet();

        for (String key : keys) {
            System.out.println(key);
        }


        System.out.println(hm.get("India"));
        System.out.println(hm.remove("China"));
        System.out.println(hm.get("China"));
        System.out.println(hm.isEmpty());
    }

    
}
