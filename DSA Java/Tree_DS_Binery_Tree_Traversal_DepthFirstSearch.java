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
    Node root;
    
    BinaryTree(int value){
        root=new Node(value);
    }
    public void preorder(Node start, ArrayList<Integer> traversal){
        if(start == null){
            return;
        }
        traversal.add(start.value);
        preorder(start.left, traversal);
        preorder(start.right, traversal);
    }
    public void inorder(Node start, ArrayList<Integer> traversal){
        if(start == null){
            return;
        }
        inorder(start.left, traversal);
        traversal.add(start.value);
        inorder(start.right, traversal);
    }
    public void postorder(Node start, ArrayList<Integer> traversal){
        if(start == null){
            return;
        }
        postorder(start.left, traversal);
        postorder(start.right, traversal);
        traversal.add(start.value);
    }
}
public class Tree_DS_Binery_Tree_Traversal_DepthFirstSearch{
    public static void main(String args[]){
        
        BinaryTree tree = new BinaryTree(50);
        
        tree.root.left = new Node(10);
        tree.root.left.left = new Node(55);
        tree.root.left.right = new Node(80);
        
        tree.root.right = new Node(90);
        tree.root.right.left = new Node(44);
        tree.root.right.right = new Node(60);
        
        
        
        ArrayList<Integer> preorderlist = new ArrayList<>();
        tree.preorder(tree.root , preorderlist);
        System.out.println("Preorder : "+preorderlist);
        
        ArrayList<Integer> inorderlist = new ArrayList<>();
        tree.inorder(tree.root , inorderlist);
        System.out.println("Inorder : "+inorderlist);
        
        ArrayList<Integer> postorderlist = new ArrayList<>();
        tree.postorder(tree.root , postorderlist);
        System.out.println("Postorder : "+postorderlist);
        
        
    }
}