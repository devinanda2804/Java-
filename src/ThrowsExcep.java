

// Java program to demonstrate working of throws

class ThrowsExcep {

    static void display() throws IllegalAccessException
    {
        System.out.println("Inside");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[])
    {
        try {
            display();
        }
        catch (IllegalAccessException e) {
            System.out.println("Exception caught");
        }
    }}