//Q8. Find the occurrence of the first and last occurrence of an element using recursion.
public class Recursion_Q8 {
    public static int first = -1;
    public static int last = -1;
    
    public static void getIndices(String str , char el , int index){
        if(index == str.length()-1){
            return ;
        }
        if(str.charAt(index) == el){
            if(first == -1){
                first = index;
            }else{
                last = index;
            }
        }
        
        getIndices(str , el , index+1);
    }
    
    public static void main(String args[]){
        String str = "tabcdfghijakkk";
        char el = 'a';
        getIndices(str, el, 0);
        System.out.println("First occurence : " + first);
        System.out.println("Last occurence : " + last);
    }
}
