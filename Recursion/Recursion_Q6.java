//Q6. Print x^n (with stack height = n)
public class Recursion_Q6 {
    public static int printPower(int x, int n) {
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        
        int ans = x * printPower(x,n-1);
        return ans ;
    }
    public static void main(String args[]) {
        int x = 2, n = 4;
        int output = printPower(x, n);
        System.out.println(output);
    }
}
