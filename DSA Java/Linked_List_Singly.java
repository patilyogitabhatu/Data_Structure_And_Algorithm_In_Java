public class Linked_List_Singly {
    Node head;
    int size = 0;

    class Node{
        int data;
        Node next;
        

        Node(int data){
            this.data = data ;
            this.next = null;
        }
    }
    int listSize(){
        return size;
    }
    void addFirst(int data){
        Node newNode = new Node(data);
        size +=1;

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void addLast(int data){
        Node newNode = new Node(data);
        size +=1;
        if(head == null){
            head = newNode;
            return;
        }
        Node cur = head;

        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = newNode;
    }
    void addAt(int position , int data){
        if(position == 0){
            addFirst(data);
        }
        else if(position == size-1){
            addLast(data);
        }
        else if(position> size-1){
            System.out.println("Invalid Index");
            return ;
        }
        else{
        Node newNode = new Node(data);
        size +=1;
        
        Node cur = head;
        int count = 1;

        while(count != position-1){
            cur = cur.next;
            count +=1;
        }
        newNode.next = cur.next;
        cur.next = newNode;
        }
    }
    void removeFront(){
        size -=1;
        if(head == null){
            System.out.println("List is empty");
            return;   
        }
        head = head.next;
    }
    void removeLast(){
        size -=1;
        if(head == null){
            System.out.println("List is empty");
            return;   
        }
        Node cur = head;

        while(cur.next.next != null){
            cur = cur.next;

        }
        cur.next = null;

    }
    void removeAt(int position){
        if(position == 0){
            removeFront();
        }
        else if(position == size-1){
            removeLast();
        }
        else{
            size -=1;
            Node cur = head;
            int count = 1;

            while(count != position){
                System.out.println(cur.data+"  "+count);
               
                cur = cur.next;
                count +=1;
                
            }
            // // System.out.println(cur.data);
            // cur.next = cur.next.next;
        }
    }
    void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return ;
        }
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data+"->");
            cur = cur.next;
        }
        System.err.println("null");
    }

    public static void main(String args[]){
        Linked_List_Singly ll = new Linked_List_Singly();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addFirst(00);

        ll.printList();

        System.out.println(ll.size);
        ll.addAt(3, 88);
        ll.printList();

        System.out.println(ll.listSize());

        // ll.removeFront();
        ll.printList();
        ll.removeAt(4);
        ll.printList();

        System.out.println(ll.listSize());
    }
}
