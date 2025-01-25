
class Node {

    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {

    static int idx = -1;

    public static Node buildTree(int node[]) {
        idx++;
        if (node[idx] == -1) {
            return null;
        }
        Node newNode = new Node(node[idx]);
        newNode.left = buildTree(node);
        newNode.right = buildTree(node);

        return newNode;
    }
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftnode = countNodes(root.left);
        int rightnode = countNodes(root.right);
        
        return leftnode + rightnode +1;
    }
}
public class Tree_DS_Binery_Tree_Count_Of_Nodes_2 {
    public static void main(String args[]) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println(tree.countNodes(root));
    }
}
