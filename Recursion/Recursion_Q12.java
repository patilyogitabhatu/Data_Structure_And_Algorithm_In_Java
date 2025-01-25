//Q12. Remove duplicates in a string.
import java.util.*;
public class Recursion_Q12 {
    public static String removeDupli(String str, int idx){
        if(idx == str.length()){
            return str;
        }
        char demo = str.charAt(idx);
        
        if(str.substring(0,idx).contains(String.valueOf(demo))){
            
            str = str.substring(0,idx) + str.substring(idx + 1);
            
            idx--;
        }
        

        return removeDupli(str , idx+1);
    }
    
    public static void main(String args[]){
        String str = "abbccdgg";
        String newStr = removeDupli(str, 0);
        System.out.println("New String: " + newStr);
    }
}
