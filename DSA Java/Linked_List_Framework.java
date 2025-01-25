import java.util.*;
public class Linked_List_Framework {
    public static void main(String args[]){
        LinkedList<Integer> llist = new LinkedList<>();

        llist.add(10);
        llist.add(20);
        llist.add(30);
        System.out.println(llist);
        
        llist.addFirst(00);
        System.out.print("Add at First : ");
        System.out.println(llist);

        llist.addLast(40);
        System.out.print("Add at last: ");
        System.out.println(llist);

        llist.removeFirst();
        System.out.print("Remove from first: ");
        System.out.println(llist);

        llist.removeLast();
        System.out.print("Remove from Last: ");
        System.out.println(llist);
    }
}
