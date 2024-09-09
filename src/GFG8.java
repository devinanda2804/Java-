/**
 * The {@code GFG} class demonstrates compile-time polymorphism
 */
public class GFG8 {

    /**
     * @param a the first integer to be added
     * @param b the second integer to be added
     * @return the sum of {@code a} and {@code b}
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * @param a the first double value to be added
     * @param b the second double value to be added
     * @return the sum of {@code a} and {@code b}
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(add(2, 3)); // Calls add(int, int)
        System.out.println(add(2.0, 3.0)); // Calls add(double, double)
    }
}
