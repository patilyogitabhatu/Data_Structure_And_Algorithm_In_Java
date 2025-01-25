public class Queue_Using_Array {
    static class Queue{
        int arr[];
        int size ;
        int rear ;

        Queue(int s){
            arr = new int[s];
            size = s;
            rear = -1;
        }
        boolean isEmpty(){
            return rear == -1;
        }
        boolean isFull(){
            return rear == size-1;
        }
        void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0 ; i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
    
}
