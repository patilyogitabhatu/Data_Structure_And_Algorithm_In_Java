//Q11. Move all ‘x’ to the end of the string. - O(n)
public class Recursion_Q11 {
    public static String moveAllX(String str ,  int idx , int count){
        if(idx == str.length()){
            for(int i=0 ; i<count ; i++){
                str +='x';
            }
            return str;
        }
        
        if(str.charAt(idx) == 'x'){
            count +=1;
            
            str = str.substring(0,idx) + str.substring(idx+1, str.length()) ;
            
        
            return moveAllX(str , idx , count);
            
        }
        
        return moveAllX(str , idx+1 , count);
    }
    public static void main(String args[]){
        String str = "afvxgvxxh";
        int count = 0;
        String newStr = moveAllX(str, 0, count);
        System.out.println("new  : "+newStr);
    }
}
