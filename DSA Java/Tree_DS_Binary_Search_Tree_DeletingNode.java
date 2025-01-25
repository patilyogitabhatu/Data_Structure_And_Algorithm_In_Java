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
    public static Node delete(Node root, int val){
        if(root.value > val){
            root.left = delete(root.left , val);
        }
        else if(root.value < val){
            root.right = delete(root.right , val);
        }
        else{ // root.value == val
            //case 1
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //case 3
            Node IS = inorderSuccessor(root.right);
            root.value = IS.value;
            root.right = delete(root.right , IS.value);
            
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    
}
public class Tree_DS_Binary_Search_Tree_DeletingNode {
    public static void main(String args[]){
        int numbers[] ={8,5,3,1,4,6,10,11,14};
        Node root = null;
        BST bst = new BST();
        
        for(int i=0 ; i<numbers.length ; i++){
            root = bst.buildBST(root , numbers[i]);
        }
        
        bst.inorder(root);
        
        bst.delete(root , 4);
        
        System.out.println();
        bst.inorder(root);
    }
}
