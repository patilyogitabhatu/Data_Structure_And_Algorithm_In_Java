class Searching_Interpolation_Search{
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int target = 40 ;
        int left = 0;
        int right = arr.length - 1;
        
        int index = -1;
        
        while(left <= right && target >= arr[left] && target<=arr[right]){
            int position = left + ( (target - arr[left]) * (right-left)) / (arr[right]-arr[left]);
            
            if(target == arr[position]){
                index = position;
                break;
            }
            else if(target>arr[position]){
                left = position + 1;
            }
            else if(target < arr[position]){
                right = position -1;
            }
        }
        if(index >= 0){
            System.out.println("Element found at index : "+index);
        }else{
            System.out.println("Element not found.");
        }
    }
}