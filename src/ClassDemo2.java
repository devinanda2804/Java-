
/**
 * The Outer1 class contains a method which defines a local inner class.
 */
import java.util.*;
import java.io.*;
class Outer1 {
    void message() {
        System.out.println("From outer class");

        class Inner1 {
            void display() {
                System.out.println("This is from a nested class");
            }
        }
        Inner1 obj1=new Inner1();
        obj1.display();
    }
}
class ClassDemo2{
    /**
     * The main method where the program starts.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args){
        Outer1 obj2=new Outer1();
        obj2.message();
    }
}

