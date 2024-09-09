// Java program to demonstrate interface
import java.io.*;
interface in1 {
    final int a = 10;
    void display();
}

// A class that implements the interface.
class Test9 implements in1 {
    public void display() {
        System.out.println("Good Morning");
    }
    /* @param args Command line arguments (not used).
            */
    public static void main(String[] args)
    {
        Test9 t = new Test9();
        t.display();
        System.out.println(a);
    }
}
