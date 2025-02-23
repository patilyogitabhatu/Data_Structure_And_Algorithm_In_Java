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
    public static int treeHeight(Node root){
        if(root == null){
            return 0;
        }
        int leftheight = treeHeight(root.left);
        int rightheight = treeHeight(root.right);
        
        int myheight = Math.max(leftheight , rightheight)+1;
        
        return myheight;
    }
}


public class Tree_DS_Binary_Tree_Height_Of_Tree_2 {
    public static void main(String args[]) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println(tree.treeHeight(root));

    }
}
