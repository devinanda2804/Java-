import java.io.*;
import java.util.*;
class MyException4{
    public static void display(){
        try{
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e){
            System.out.println("Exception1");
            throw e;
        }
    }
    public static void main(String[] args){
        try{
            display();
        }
              catch(NullPointerException e){
                System.out.println("Exception2");
            }

    }
}
