import java.util.*;
public class Stack_Using_ArrayList {
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();
        boolean isEmpty(){
            return list.size()==0;
        }
        void push(int data){
            list.add(data);
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return list.remove(list.size()-1);
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return list.get(list.size()-1);
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
