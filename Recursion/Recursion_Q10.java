//Q10. Check if an array is sorted (strictly increasing). - O(n)
public class Recursion_Q10 {
    public static boolean isSort(int arr[] , int index){
        if(index == arr.length-1){
            return true;
        }
        if(!(arr[index] < arr[index+1])){
            return false;
        }  
        return isSort(arr , index+1);
    }
    
    public static void main(String args[]){
        int arr[] = {1 , 2 , 3 , 4 , 5};
        boolean ans = isSort(arr , 0);
        System.out.println("Array is sorted: "+ans);
    } 
}
