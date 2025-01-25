import java.util.*;
public class ArrayList_Method {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();

        //add()
        System.out.println("add()");
        arr1.add(10);
        arr1.add(50);
        arr1.add(20);
        arr1.add(60);
        System.out.println("After adding 10 50 20 60 in arr1 using add()");
        System.out.println(arr1);

        //size()
        System.out.println("___________________");
        System.out.println("size()");
        System.out.println(arr1);
        System.out.println("Size of Arr1 is: "+arr1.size());

        //addAll()
        System.out.println("___________________");
        System.out.println("addAll()");
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(30);
        arr2.add(70);
        arr2.add(40);
        arr2.add(80);
        arr1.addAll(arr2);
        System.out.println("After add arr2 in the arr1 array using addAll()");
        System.out.println(arr1);

        //clone()
        System.out.println("___________________");
        System.out.println("clone()");
        ArrayList demo = (ArrayList) arr1.clone();
        System.out.println("After create clone of arr1 as demo "+demo);

        //contains()
        System.out.println("_____________________");
        System.out.println("contains()");

        System.out.println(demo);
        System.out.println("101 is present in the demo: "+demo.contains(101));
        System.out.println("80 is present in the demo: "+demo.contains(80));

        //forEach()
        System.out.println("__________________");
        System.out.println("multiple each element in the arr1 with 2 using forEach");
        arr1.forEach(n -> System.out.print((n*2) + " "));
        System.out.println();

        //get()
        System.out.println("________________");
        System.out.println("get()");
        System.out.println(arr1);
        System.out.println("getting the element present at the 1 index using get(): "+arr1.get(1));

        //indexOf()
        System.out.println("________________");
        System.out.println("indexOf()");
        System.out.println(arr1);
        System.out.println("getting the index of 20 element: "+arr1.indexOf(20));

        //isEmpty()
        System.out.println("________________");
        System.out.println("isEmpty()");
        System.out.println("Array is Empty: "+arr1.isEmpty());

        //lastIndexOf()
        System.out.println("________________");
        System.out.println("lastIndexOf()");
        arr1.add(50);
        
        System.out.println(arr1);
        System.out.println("1st occurrence of 50 at index "+arr1.indexOf(50));
        System.out.println("Last occurrence of 50 at index "+arr1.lastIndexOf(50));

        //remove()
        System.out.println("________________");
        System.out.println("remove()");
        arr1.remove(8);
        System.out.println("After removing the 8th index element");
        
        System.out.println(arr1);

        // //removeIf()
        // System.out.println("________________");
        // System.out.println("removeIf()");
        // arr2.removeIf(n -> n%2==0);
        // System.out.println("After using remove if method which remove elements which are even");
        // // arr1.forEach(n -> System.out.print(n+" "));
        // System.out.println(arr2);

        //replaceAll()
        System.out.println("________________");
        System.out.println("replaceAll()");
        System.out.println("Before Replacing: "+arr2);
        arr2.replaceAll(n -> n+2);
        System.out.println("After Replacing all elements by adding 2: "+arr2);

        //set()
        System.out.println("________________");
        System.out.println("set()");
        System.out.println("Before using set() : "+arr2);
        arr2.set(1, 80);
        System.out.println("After using set() set 80 at index 1: "+arr2);

        //sort()
        System.out.println("________________");
        System.out.println("sort()");
        System.out.println("Before sort : "+arr1);
        arr1.sort(null);
        System.out.println("After sort: "+arr1);

        //toArray()
        System.out.println("________________");
        System.out.println("toArray()");

        Object[] array = arr1.toArray();
        for(Object i: array){
            System.out.print(i+" ");
        }




        
        




    }

}
