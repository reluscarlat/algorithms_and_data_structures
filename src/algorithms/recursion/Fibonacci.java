package algorithms.recursion;

public class Fibonacci {
    static int fibValues[] = new int[1000];

    public static int fibonacci(int n) {
        if(n == 0 || n == 1) return 1;
        if(fibValues[n] == 0) {
            return fibonacci(n-1) + fibonacci(n-2);
        } else {
            return fibValues[n];
        }
    }
}
