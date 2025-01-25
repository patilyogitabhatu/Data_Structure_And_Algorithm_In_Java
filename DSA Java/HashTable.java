import java.util.*;
public class HashTable {
    public static void main(String args[]){
        Hashtable<Integer , String> hashtable = new Hashtable<>();
        
        //Adding key Value pairs
        hashtable.put(1, "Alice");
        hashtable.put(2, "Bob");
        hashtable.put(3, "Charlie");
        hashtable.put(4, "Dovid");
        
        //Print Hash table
        System.out.println("Initial Hashtable: "+hashtable);
        
        //get()
        System.out.println("________________");
        System.out.println("get()");
        System.out.println("Retriving the value of 4 key : "+hashtable.get(4));
        
        //remove()
        System.out.println("________________");
        System.out.println("remove()");
        System.out.println("Before  Hashtable: "+hashtable);
        hashtable.remove(4);
        System.out.println("After removing 4th key from Hashtable: "+hashtable);
        
        //containsKey()
        System.out.println("________________");
        System.out.println("containsKey()");
        System.out.println("key 4 contains in the hashtable: "+hashtable.containsKey(4));
        System.out.println("Key 1 contains in the hashtable: "+hashtable.containsKey(1));
        
        //containsValue()
        System.out.println("________________");
        System.out.println("containsValue()");
        System.out.println("value abc contains in the hashtable: "+hashtable.containsValue("abc"));
        System.out.println("value Bob contains in the hashtable: "+hashtable.containsValue("Bob"));
        
        //Iterating Over Keys and Value
        System.out.println("________________");
        System.out.println("Iterating using key");
        for(Integer key: hashtable.keySet()){
            System.out.println("key: "+key+" ,value "+hashtable.get(key));
        }
        
        //size()
        System.out.println("________________");
        System.out.println("Size of hashtable: "+hashtable.size());
        
        //isEmpty()
        System.out.println("________________");
        System.out.println("Is hashtable Empty : "+hashtable.isEmpty());
        
        //clear()
        System.out.println("________________");
        hashtable.clear();
        System.out.println("After using clear function on hashtable :"+hashtable);
        
        System.out.println("Is hashtable Empty : "+hashtable.isEmpty());
    }
}
