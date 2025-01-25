public class Linked_List_Circular {
    Node head;
    Node tail;
    int size = 0;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    void addFront(int data){
        Node newNode = new Node(data);
        size +=1;
        if(head == null){
            head = tail = newNode;
            tail.next = head;
            
        }else{
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

    }
    void addAt(int position , int data){
        if(position == 0){
            addFront(data);
        }else if(position == size-1){
            addLast(data);
        }else if(position >=size){
            System.out.println("Invalid Index");
            return;
        }else{
            Node newNode = new Node(data);
            size +=1;
            Node cur = head;
            int count = 0;
            while(count != position-1){
                cur = cur.next;
                count +=1;
            }
            newNode.next = cur.next;
            cur.next = newNode;
        }
    }
    void addLast(int data){
        Node newNode = new Node(data);
        size +=1;
        if(head == null){
            head = tail = newNode;
            tail.next = head;
        }else{
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
        }
    }
    void removeFront(){
        size -=1;
        if(head == null){
            size = 0;
            System.out.print("Linked List is Empty");
        }else if(head == tail){
            head = tail = null;
        }else{
            tail.next = head.next;
            head = head.next;
        }
    }
    void removeAt(int position){
        if(head == null){
            System.out.println("Linked List is Empty");
        }else if(position == 0){
            removeFront();
        }else if(position == size-1){
            removeLast();
        }else if((position >= size)||(position < 0)){
            System.out.println("Invalid index");
        }else{
            size -=1;
            Node cur = head;
            int count = 0;
            while(count != position-1){
                cur = cur.next;
                count +=1;
            }
            cur.next = cur.next.next;
        }
        
    }
    void removeLast(){
        size -=1;
        if(head == null){
            size = 0;
            System.out.print("Linked List is Empty");
        }else if(head == tail){
            head = tail = null;
        }else{
            Node cur = head;

            while(cur.next != tail){
                cur = cur.next;
            }
            cur.next = head;
            tail = cur;
        }

    }
    void printClist(){
        if(head == null){
            System.out.println("Linked List is Empty");
        }else{
            Node cur = head;
            do{
                System.out.print(cur.data+" -> ");
                cur = cur.next;
            }while(cur!=head);
            System.out.print("Null");
            System.out.println();
        }
    
    }
    public static void main(String args[]){
        Linked_List_Circular CLL = new Linked_List_Circular();
        CLL.addLast(10);
        CLL.addLast(20);
        CLL.addLast(30);
        CLL.addLast(40);
        CLL.addLast(50);
        CLL.addFront(00);
        CLL.addFront(01);

        CLL.printClist();

        CLL.addAt(3, 88);
        CLL.printClist();
        System.out.println("size: "+CLL.size);

        CLL.removeFront();
        CLL.printClist();
        System.out.println("size: "+CLL.size);

        CLL.removeLast();
        CLL.printClist();
        System.out.println("size: "+CLL.size);

        CLL.removeAt(2);
        CLL.printClist();
        System.out.println("size: "+CLL.size);

        
    }
}
