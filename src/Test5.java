// Program to demonstrate Constructor Chaining using this() keyword in same class
class Test5
{
    // default constructor 1
    Test5()
    {
        this(5);
        System.out.println("This is the first constructor");
    }

    // Parameterized constructor 2
    /* @param x The first integer parameter.
     */
    Test5(int x)
    {
        this(5, 15);
        System.out.println(x);
    }

    // Parameterized constructor 3
    /* @param x The first integer parameter.
     * @param y The second integer parameter.
     */
    Test5(int x, int y)
    {
        System.out.println(x * y);
    }
    /* @param args Command-line arguments (not used).
        */
    public static void main(String args[])
    {
        new Test5();
    }
}
