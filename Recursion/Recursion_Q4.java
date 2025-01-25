////Q4. Print factorial of a number n.
public class Recursion_Q4 {
    public static void factorial(int n , int fact){
        
        if(n == 0){
            System.out.println(fact);
            return;
        }
        System.out.println(fact);
        fact *=n;
        factorial(n-1 , fact);

    }
    public static void main(String args[]){
        int n=5;
        factorial(5,1);
    }
}
