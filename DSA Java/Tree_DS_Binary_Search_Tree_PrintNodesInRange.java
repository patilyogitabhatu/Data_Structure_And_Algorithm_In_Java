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
    public static void printInRange(Node root ,  int x , int y){
        if(root == null){
            return ;
        }
        if(root.value >=x && root.value <=y){
            printInRange(root.left, x , y);
            System.out.print(root.value+" ");
            printInRange(root.right, x ,y);
        }
        if(y < root.value){
            printInRange(root.left,x,y);
        }else if(x > root.value){
            printInRange(root.right,x,y);
        }
    }
}
public class Tree_DS_Binary_Search_Tree_PrintNodesInRange {
    public static void main(String args[]){
        int numbers[] ={8,5,3,1,4,6,10,11,14};
        Node root = null;
        BST bst = new BST();
        
        for(int i=0 ; i<numbers.length ; i++){
            root = bst.buildBST(root , numbers[i]);
        }
        
        bst.inorder(root);
        System.out.println();
        
        System.out.println("Nodes which in the range of 6 to 10");
        bst.printInRange(root , 6, 10);
    }
}
