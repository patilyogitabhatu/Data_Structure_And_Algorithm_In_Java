public class Array_Sorting_Insertion_Sort {
    public static void main(String args[]){
        int arr[] = {50,30,10,90,60};
        
        for(int i=1 ; i<arr.length ; i++){
            int current = arr[i];
            int j= i-1;
            
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
            
        }
        
        System.out.println("After using Insertion Sorting: ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
