//Q5. Print the fibonacci sequence till nth term.
public class Recursion_Q5 {
    public static void fibonaci(int n , int a , int b){
        if(n == 0){
            return ;
        }
        System.out.print(a+" ");
        int c = a+b;
        fibonaci(n-1 , b , c);
    }
    
    public static void main(String args[]){
        int n = 5;
        fibonaci(n, 0 , 1);
    }
}
