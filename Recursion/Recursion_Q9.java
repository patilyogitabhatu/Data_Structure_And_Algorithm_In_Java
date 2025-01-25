//Q9. Print a string in reverse.
public class Recursion_Q9 {
    public static String reverseString(String str){
        
        if(str.length() == 1) {
            
            return str;
        }
        char currChar = str.charAt(0);
        // System.out.println(currChar);
        
        String nextString = reverseString(str.substring(1));
        // System.out.println("==="+nextString);
        
        System.out.println(nextString+" : "+currChar);
        
        return nextString + currChar;
    }
    public static void main(String args[]){
        String str = "abcd";
        
        System.out.println(reverseString(str));
    }
}
