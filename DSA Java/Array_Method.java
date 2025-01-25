import java.util.*;
class Array_Method{
    public static void main(String args[]){
        //Arrays.compare()
        System.out.println("Arrays.compare()");

        //Returns 0 if the arrays are equal.
        int arr1[] = {40,60,50,80};
        int arr2[] = {40,60,50,80};
        System.out.println(Arrays.compare(arr1,arr2)+" :Bothe arr1 and arr2 are equals.");

        //Returns a negative integer if the array1 is less than array2 lexicographically
        int arr3[] = {40,60,50,70};
        int arr4[] = {40,60,50,80};
        System.out.println(Arrays.compare(arr3,arr4)+" :arr3 is less than arr4");

        //Returns a positive integer if array1 is greater than array2 lexicographically.
        int arr5[] = {40,60,50,90};
        int arr6[] = {40,60,50,80};
        System.out.println(Arrays.compare(arr5,arr6)+" :arr5 is less than arr6");

        //Arrays.equals()
        System.out.println("__________________");
        System.out.println("Arrays.equals()");
        System.out.println(Arrays.equals(arr1,arr2)+" :arr1 and arr2 both are equals.");
        System.out.println(Arrays.equals(arr3,arr4)+" :arr3 and arr4 both are not equals.");

        //Arrays.fill()
        System.out.println("_________________");
        System.out.println("Arrays.fill()");
        System.out.println("Before fill funtion applied to arr1");
        for(int a : arr1){
            System.out.print(a+" ");
        }

        Arrays.fill(arr1,2);
        System.out.println();
        System.out.println("After fill funtion applied to arr1");
        for(int a : arr1){
            System.out.print(a+" ");
        }

        Arrays.fill(arr1,2,4,10);
        System.out.println();
        System.out.println("After fill funtion applied to arr1 fill 10 from 2 index to 3");
        for(int a : arr1){
            System.out.print(a+" ");
        }
        System.out.println();

        //Arrays.sort()
        System.out.println("__________________");
        System.out.println("Arrays.sort()");
        System.out.println("Before sort funtion applied to arr2");
        for(int a : arr2){
            System.out.print(a+" ");
        }
        Arrays.sort(arr2);

        System.out.println();
        System.out.println("After sort funtion applied to arr2");
        for(int a : arr2){
            System.out.print(a+" ");
        }
        System.out.println();

        //Arrays.copyOf()
        System.out.println("________________");
        System.out.println("Arrays.copyOf(int[] original-array, int new-length)");
        int demo[] = Arrays.copyOf(arr2,5);
        demo[4] = 100;
        System.out.println("After create copy of arr2 with demo array");
        for(int a : demo){
            System.out.print(a+" ");
        }
        System.out.println();

        //length;
        System.out.println("__________________");
        System.out.println("length");
        System.out.println("length of the demo[] is "+ demo.length);





        



    }
}