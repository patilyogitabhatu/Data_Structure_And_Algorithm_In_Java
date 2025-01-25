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
    static int idx=-1;
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
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+" ");
    }
}
public class Tree_DS_Binery_Tree_Traversal_DepthFirstSearch_2 {
    public static void main(String args[]){
        
        BinaryTree tree = new BinaryTree();
        int nodes[] = {1,2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = tree.buildTree(nodes);
        System.out.println(root.value);
        
        System.out.println("Preorder:");
        tree.preorder(root);
        System.out.println();
        
        System.out.println("Inorder:");
        tree.inorder(root);
        System.out.println();
        
        System.out.println("Postorder:");
        tree.postorder(root);
        System.out.println(); 
    }
}
