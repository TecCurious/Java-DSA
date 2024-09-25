import java.util.*;
public class PrefixProblem {

    public static class Node {
        Node children[] = new Node[26];
        boolean eow  = false;
        int freq = 1;

        Node(){
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
        }

    }
    static Node root = new Node();
    public static void insert(String str){
        Node curr = root;

        for(int i=0; i<str.length(); i++){
            int idx = str.charAt(i)  - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

// my code
    public static void findPrefix(String str){
        Node curr = root;
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            
            ans.append(str.charAt(i));
            int idx = str.charAt(i) - 'a';
            if(curr.children[idx].freq == 1){
                System.out.print(ans+" ");
                break;
            }
            
            curr = curr.children[idx];

        }
    }
// in course code
    public static void recursiveFind(Node root, String ans){

        // base case
        if(root == null){
           return;
        }

        if(root.freq == 1){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<root.children.length; i++){
            if(root.children[i] != null){
                recursiveFind(root.children[i], ans+(char)(i+'a'));
            }
        }
    }
    
    public static void main(String[] args) {
        String word[] = {"zebra","dog","dove","duck"};

        for(int i=0; i<word.length; i++){
            insert(word[i]);
        }

        // for(int i=0; i<word.length; i++){
        //     findPrefix(word[i]);
        // }
        root.freq = -1;
        recursiveFind(root, "");
    }
}
