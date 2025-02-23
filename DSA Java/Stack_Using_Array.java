public class Stack_Using_Array {
    static class Stack{
        int arr[];
        int top ;

        Stack(int s){
            arr = new int[s];
            top = 0;
        }
        void push(int data){
            if(isFull()){
                System.out.println("Stack is full");
                return ;
            }
            arr[top] = data;
            top++;            
        }
        boolean isEmpty(){
            return top == 0;
        }
        boolean isFull(){
            return top == arr.length;
        }
        void pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return ;
            }
            top--;
            arr[top]=0;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top-1];
        }

    }
    public static void main(String args[]){
        Stack s = new Stack(5);
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
