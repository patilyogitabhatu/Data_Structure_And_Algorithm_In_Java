public class Linked_List_Doubly {
    Node head;
    int size = 0;
    class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    void addFirst(int data){
        Node newNode = new Node(data);
        size +=1;
        if(head == null){
            head = newNode;
            return ;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    void addAt(int position, int data){
        if(position == 0){
            addFirst(data);
        }
        else if(position == size-1){
            addLast(data);
        }
        else{
            Node newNode = new Node(data);
            size +=1;

            Node cur = head;
            int count = 0;

            while(count != position-1){
                cur = cur.next;
                count +=1;
            }
            newNode.prev = cur;
            newNode.next = cur.next;
            cur.next.prev = newNode;
            cur.next = newNode;
            
        }
    }
    void addLast(int data){
        Node newNode = new Node(data);
        size +=1;

        if(head == null){
            head = newNode;
            return ;
        }
        Node cur = head;
        
        while(cur.next != null){
            cur = cur.next;
        }
        newNode.prev = cur;
        cur.next = newNode;
        
    }
    void removeFront(){
        
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        head.prev = null;
        size -=1;
    }
    void removeLast(){
        
        if(head == null){
            System.out.println("List is Empty");
            return ;
        }
        Node cur = head;
        int count = 0;

        while(count != size-2){
            cur = cur.next;
            count +=1;
        }
        cur.next = null;
        size -=1;
    }
    void removeAt(int position){
        if(position == 0){
            removeFront();
        }
        else if(position == size-1){
            removeLast();
        }
        else if(position >= size){
            System.out.println("Invalid Index");
            return;
        }
        else{
            Node cur = head ;
            int count = 0;
            while(count != position-1){
                cur = cur.next;
                count +=1;
            }
            cur.next = cur.next.next;
            cur.next.prev = cur;
            size -=1;
        }
    }
    void printList(){
        if(head == null){
            System.out.print("List is Empty");
        }

        Node cur = head;

        while(cur != null){
            System.out.print(cur.data+" -> ");
            cur = cur.next;
        }
        System.out.print("NULL");
        System.err.println();
        
    }
    public static void main(String args[]){
        Linked_List_Doubly LLD = new Linked_List_Doubly();
        LLD.addFirst(30);
        LLD.addFirst(20);
        LLD.addFirst(10);
        LLD.addFirst(00);
        LLD.printList();

        LLD.addLast(40);
        LLD.addLast(50);
        LLD.printList();

        LLD.addAt(4,88);
        LLD.printList();
        System.out.println(LLD.size);

        LLD.removeLast();
        LLD.removeLast();
        LLD.printList();
        System.out.println(LLD.size);

        LLD.removeAt(2);
        LLD.printList();

        

    }
}
