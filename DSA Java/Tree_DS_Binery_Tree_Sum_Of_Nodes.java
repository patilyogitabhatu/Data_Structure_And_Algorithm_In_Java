import java.util.*;
class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value=value;
        this.left = null;
        this.right = null;
    }
}
class BinaryTree{
    Node root;
    static int sumOfNodes=0;
    BinaryTree(int value){
        root = new Node(value);
    }
    public static int sumNodes(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            Node cur = q.remove();
            if(cur != null){
                sumOfNodes += cur.value;
                if(cur.left != null){
                    q.add(cur.left);
                }
                if(cur.right != null){
                    q.add(cur.right);
                }
            }
        }
        return sumOfNodes;
    }
}
public class Tree_DS_Binery_Tree_Sum_Of_Nodes {
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree(3);

        tree.root.left = new Node(4);
        tree.root.left.right = new Node(7);
        tree.root.left.left = new Node(6);

        tree.root.right = new Node(5);
        tree.root.right.right = new Node(9);
        tree.root.right.left = new Node(8);
        
        System.out.println("Sum Of All Nodes: "+tree.sumNodes(tree.root));
    }
}
