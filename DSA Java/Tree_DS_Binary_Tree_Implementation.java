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

    BineryTree(int value){
        root = new Node(value);
    }
}
public class Tree_DS_Binary_Tree_Implementation {
    public static void main(String args[]){
        BineryTree tree = new BineryTree(3);

        tree.root.left = new Node(4);
        tree.root.left.right = new Node(7);
        tree.root.left.left = new Node(6);

        tree.root.right = new Node(5);
        tree.root.right.right = new Node(9);
        tree.root.right.left = new Node(8);

        System.out.println(tree.root.left.value);
        System.out.println(tree.root.right.value);

    }
}
