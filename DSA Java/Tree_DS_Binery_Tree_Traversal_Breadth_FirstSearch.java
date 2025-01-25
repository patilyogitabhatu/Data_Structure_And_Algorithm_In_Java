import java.util.*;
class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    Node root;
    BinaryTree(int value){
        root=new Node(value);
    }
    public static ArrayList<Integer> levelorder(Node root){
        if(root == null){
            return null;
        }
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        ArrayList<Integer> traversal = new ArrayList<>();
        
        while(!q.isEmpty()){
            traversal.add(q.peek().value);
            Node node = q.remove();
            if(node.left !=null ){
                q.add(node.left);
            }
            if(node.right != null){
                q.add(node.right);
            }
        }
          return traversal;
    }
    
}
public class Tree_DS_Binery_Tree_Traversal_Breadth_FirstSearch {
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree(3);

        tree.root.left = new Node(4);
        tree.root.left.right = new Node(7);
        tree.root.left.left = new Node(6);

        tree.root.right = new Node(5);
        tree.root.right.right = new Node(9);
        tree.root.right.left = new Node(8);

        System.out.println(tree.root.left.value);
        System.out.println(tree.root.right.value);
        
        System.out.println(tree.levelorder(tree.root));
    }
}
