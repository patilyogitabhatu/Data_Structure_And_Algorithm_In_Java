import java.util.*;
class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    static int idx = -1;
    public static Node buildTree(int node[]){
        idx++;
        if(node[idx] == -1){
            return null;
        }
        
        Node newNode = new Node(node[idx]);
        newNode.left = buildTree(node);
        newNode.right = buildTree(node);
        
        return newNode;
    }
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            Node cur = q.remove();
            if(cur != null){
                System.out.print(cur.value+" ");
                if(cur.left != null){
                    q.add(cur.left);
                }
                if(cur.right != null){
                    q.add(cur.right);
                }
            }
        }
        
    }
}
public class Tree_DS_Binery_Tree_Traversal_Breadth_FirstSearch_2 {
    public static void main(String args[]){
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println(root.value);
        
        tree.levelOrder(root);
        
    }
}
