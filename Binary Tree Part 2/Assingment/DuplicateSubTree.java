import java.util.HashMap;

public class DuplicateSubTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static HashMap<String, Integer> m = new HashMap<>();

    public static String inOrder(Node root) {
        // base case
        if (root == null) {
            return "";
        }

        String str = "(";

        str += inOrder(root.left);
        str += Integer.toString(root.data);
        str += inOrder(root.right);

        str += ")";

        if (m.get(str) != null && m.get(str) == 1) {
            System.out.println(str);
        }

        if (m.containsKey(str)) {
            m.put(str, m.get(str)+1);
        } else {
            m.put(str, 1);
        }

        return str;
    }

    public static void printDuplicate(Node root) {
        inOrder(root);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(3);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        root.right.left.left = new Node(3);

        printDuplicate(root);
    }
}
