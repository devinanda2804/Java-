//Program to demonstrate nested class

import java.util.*;
import java.io.*;
class Outer{
    class Inner{
        void display(){
            System.out.println("This is from a nested class");
        }
    }
}
class ClassDemo1{

    /**
     * The main method where the program starts.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args){
        Outer.Inner obj=new Outer().new Inner();
        obj.display();
    }
}

