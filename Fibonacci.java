public class Fibonacci {

        /**
     * Computes the nth term in the Fibonacci sequence.
     * 
     * @param n the position in the Fibonacci sequence (must be a positive integer)
     * @return the nth term in the Fibonacci sequence
     * @throws IllegalArgumentException if n is not a positive integer
     */

    public static int fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
