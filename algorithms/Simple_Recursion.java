/**
 * Simple recursion - Factorial 
 * 
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 17.02.2026
 * @version 0.0.1
 */
public class SimpleRecursion {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
      
        System.out.println("Factorial of " + n + " is: " + result);
    }

    // Calculates factorial of a number using recursion 
    public static int factorial(int n) {
        if (n == 0 || n == 1) {  // base case 
            return 1;  
        } else {
            return n * factorial(n - 1);  // recursive call
        }
    }
}

