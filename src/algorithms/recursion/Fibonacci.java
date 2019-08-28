package algorithms.recursion;

public class Fibonacci {
    static int fibValues[] = new int[1000];

    public static int fibonacci(int n) {
        if(n == 0 || n == 1) return 1;
        if(fibValues[n] == 0) {
            int fst = fibonacci(n-1);
            int scd = fibonacci(n-2);
            int sum = fst + scd;
            return sum;
        } else {
            return fibValues[n];
        }
    }
}
