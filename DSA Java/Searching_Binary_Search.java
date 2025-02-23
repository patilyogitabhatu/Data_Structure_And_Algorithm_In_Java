public class Searching_Binary_Search {
    public static void main(String args[]){
        int arr[] = {10,20,40,60,80,100,110};
        int target = 100;
        int index =-1;
        
        int left = 0;
        int right = arr.length-1;
        
        while(left<=right){
            int mid = (left+right)/2;
            
            if(arr[mid] == target){
                index = mid;
                break;
            }
            else if(arr[mid] > target){
                right = mid-1;
            }
            else if(arr[mid] < target){
                left = mid+1;
            }
        }
        
        
        if(index >= 0){
            System.out.println("Element found at index : "+index);
        }else{
            System.out.println("Element not found");
        }
    }
}
