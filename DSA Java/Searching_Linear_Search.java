public class Searching_Linear_Search {
    public static void main(String args[]){
        int arr[] = {50,30,40,10,70};
        int target = 40;
        int index =-1;
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }
        if(index >= 0){
            System.out.println("Element found at index : "+index);
        }else{
            System.out.println("Element not found");
        }
    }
}
