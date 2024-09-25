import java.util.*;
public class GroupAnagramTogether {

    public static class Node {
        Node children[] = new Node[26];
        boolean eow ;
        ArrayList<String> data;

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            eow = false;
            data = new ArrayList<>();
        }
    }

    static Node root;
    static List<List<String>> ans;
    public static List<List<String>> groupAnagrams(String strs[]){

        root = new Node();
        ans = new ArrayList<>();

        for(String word : strs){
            build(word);
        }

        bfs(root);

        return ans;

    }

    public static void build(String s){
        Node curr = root;
        char word[] = s.toCharArray();
        Arrays.sort(word);

        for(char c : word){
            Node child = curr.children[c-'a'];
            if(child == null){
                curr.children[c-'a'] = new Node();
            }
            curr = curr.children[c-'a'];

        }
        curr.eow = true;
        curr.data.add(s);
    }

    public static void bfs(Node root){
        if(root.eow == true){
            ans.add(root.data);
        }

        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                bfs(root.children[i]);
            }
        }
    }
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));
    }
}
