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
class BST{
    public static Node buildBST(Node root , int val){
        if(root == null){
            Node newNode = new Node(val);
            return newNode;
        }
        if(val < root.value){
            root.left = buildBST(root.left , val);
        }
        if(val > root.value){
            root.right = buildBST(root.right , val);
        }
        
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    public static void rootToLeafPath(Node root, ArrayList<Integer> arr){
        if(root == null){
            return ;
        }
        arr.add(root.value);
        
        if(root.left == null && root.right == null){
            System.out.println(arr);
        }else{
            rootToLeafPath(root.left, arr);
            rootToLeafPath(root.right, arr);
        }
        
        arr.remove(arr.size()-1);
        
    }
    
}
public class Tree_DS_Binary_Search_Tree_RootToLeafPath {
    public static void main(String args[]){
        int numbers[] ={8,5,3,1,4,6,10,11,14};
        Node root = null;
        BST bst = new BST();
        
        for(int i=0 ; i<numbers.length ; i++){
            root = bst.buildBST(root , numbers[i]);
        }
        
        bst.inorder(root);
        System.out.println();
        
        System.out.println("All Root To Leaf Path: ");
        bst.rootToLeafPath(root,new ArrayList<>());
    }
}
