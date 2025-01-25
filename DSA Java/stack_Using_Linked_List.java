public class stack_Using_Linked_List {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Stack{
        Node head = null;
        
        boolean isEmpty(){
            return head ==null;
        }
        void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
            }else{
                newNode.next = head;
                head = newNode;                
            }
        }
        int pop(){
            if(isEmpty()){
                System.out.println("stack is Empty");
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }
        int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
