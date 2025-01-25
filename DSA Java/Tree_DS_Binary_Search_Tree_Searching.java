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
    public static boolean searchKey(Node root , int val){
        if(root == null){
            return false;
        }
        if(root.value > val){
            return searchKey(root.left , val);
        }
        else if(root.value < val){
            return searchKey(root.right , val);
        }
        else {
            return true;
        }
        
    }
}
class Tree_DS_Binary_Search_Tree_Searching {
    public static void main(String args[]){
        int numbers[] = {5 , 1 , 4 , 2 , 3 , 7};
        Node root =null;
        BST bst = new BST();
        
        for(int i=0 ; i< numbers.length ; i++){
            root = bst.buildBST(root , numbers[i]);
        }
        
        boolean found = bst.searchKey(root , 10);
        System.out.println("Key 10 present in BST: "+found);
        
        boolean found2 = bst.searchKey(root, 5);
        System.out.println("Key 5 present in BST: "+found2);
    }
}
