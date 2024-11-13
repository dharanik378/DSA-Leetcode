public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive case: n * factorial of (n-1)
    }

    public static void main(String[] args) {
        int number = 5; // Example number
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
