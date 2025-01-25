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
class BST{
    public static Node buildBST(Node root, int data){
        if(root == null){
            Node newNode = new Node(data);
            return newNode;
        }
        if(data > root.value){
            root.right = buildBST(root.right , data);
        }
        if(data < root.value){
            root.left = buildBST(root.left , data);
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
}
public class Tree_DS_Binary_Search_Tree_Implementation {
    public static void main(String args[]){
        int[] val = { 5 , 1 , 3 , 4 , 2 , 7};
        Node root = null;
        BST bst = new BST();
        
        for(int i=0 ; i<val.length ; i++){
            root = bst.buildBST(root , val[i]);
        }
        System.out.println("Root value is : "+root.value);
        
        System.out.println("Inorder Sequence ");
        bst.inorder(root);
        
    }
}
