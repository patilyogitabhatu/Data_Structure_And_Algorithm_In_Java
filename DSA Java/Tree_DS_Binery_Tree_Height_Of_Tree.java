
import java.util.*;

class Node {

    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BineryTree {

    Node root;
    static int height = 0;

    BineryTree(int value) {
        root = new Node(value);
    }

    public static int treeHeight(Node root) {

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node cur = q.remove();
            if (cur != null) {
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            } else {
                height += 1;
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }
        }
        return height;
    }
}

public class Tree_DS_Binery_Tree_Height_Of_Tree {

    public static void main(String args[]) {
        BineryTree tree = new BineryTree(3);

        tree.root.left = new Node(4);
        tree.root.left.right = new Node(7);
        tree.root.left.left = new Node(6);

        tree.root.right = new Node(5);
        tree.root.right.right = new Node(9);
        tree.root.right.left = new Node(8);

        System.out.println("Height Of Tree : " + tree.treeHeight(tree.root));

    }
}
