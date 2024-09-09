// Java program to demonstrate interface inside a class.
import java.util.*;
class TestInterface {
    interface Yes {
        void display();
    }
}

class Testing implements TestInterface.Yes {
    public void display()
    {
        System.out.println("Interface inside a class");
    }
}

class Test10 {
    public static void main(String[] args)
    {

     /*
     * @param args Command line arguments (not used).
     */
        TestInterface.Yes obj;
        Testing t = new Testing();
        t.display();
    }
}