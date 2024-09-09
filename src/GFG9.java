/**
 * The {@code Test} class to demonstrate method overriding
 */
class Test {

    public void method() {
        System.out.println("Method 1");
    }
}

public class GFG9 extends Test {
    @Override
    public void method() {
        System.out.println("Method 2");
    }

    /**
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Test test = new GFG9();
        test.method();
    }
}
