public class Array_Sorting_Merge_Sort {
    public static void conquer(int arr[], int si , int mid , int ei){
        int merged[] = new int[ei-si+1];
        int idx1 = si ;
        int idx2 = mid+1;
        int x = 0;
        
        while(idx1 <=mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x] = arr[idx1];
                x++;
                idx1++;
            }else{
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        while(idx1 <= mid){
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }
        while(idx2 <= ei){
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }
        
        for(int i=0, j=si ; i<merged.length ; i++, j++){
            arr[j] = merged[i];
        }
        
    }
    public static void divide(int arr[] , int si , int ei){
        if(si >= ei){
            return ;
        }
        int mid = (si+ei)/2;
        divide(arr , si , mid);
        divide(arr , mid+1 , ei);
        // System.out.println("\n "+si+"  "+mid+"  "+ei);
        conquer(arr, si , mid , ei);
        
    }
    public static void main(String args[]){
        int arr[] = {50,30,40,10,90};
        int n = arr.length;
        
        divide(arr , 0 , n-1 );
        
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
