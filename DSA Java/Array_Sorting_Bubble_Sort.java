public class Array_Sorting_Bubble_Sort {
    public static void main(String args[]){
        int arr[] = {50,30,10,90,60};
        
        for(int iteration=0 ; iteration<arr.length-1 ; iteration++){
            for(int i=0 ; i<arr.length-iteration-1 ; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        
        System.out.println("After using Bubble Sorting: ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}