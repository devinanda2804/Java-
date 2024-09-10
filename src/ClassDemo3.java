//The program shows static nested class
import java.util.*;
import java.io.*;
class Outer2 {
    public static void message() {
        System.out.println("From outer class");
    }
        static class Inner2 {
            public static void display() {
                System.out.println("This is from a nested class");
                Outer2.message();
            }
        }
    }
class ClassDemo3{
    /**
     * The main method where the program starts.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args){
        Outer2.Inner2.display();
    }
}

