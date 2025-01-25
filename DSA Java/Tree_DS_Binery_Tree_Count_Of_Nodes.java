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
class BineryTree{
    Node root;
    static int count=0;

    BineryTree(int value){
        root = new Node(value);
    }
    public static int countNode(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur = q.remove();
            if(cur != null){
                count +=1;
                if(cur.left != null){
                    q.add(cur.left);
                }
                if(cur.right != null){
                    q.add(cur.right);
                }
            }
        }
        return count;
    }
}
public class Tree_DS_Binery_Tree_Count_Of_Nodes {
    public static void main(String args[]){
        BineryTree tree = new BineryTree(3);

        tree.root.left = new Node(4);
        tree.root.left.right = new Node(7);
        tree.root.left.left = new Node(6);

        tree.root.right = new Node(5);
        tree.root.right.right = new Node(9);
        tree.root.right.left = new Node(8);

        System.out.println("Count Of Nodes : "+tree.countNode(tree.root));

    }  
}
