import java.util.*;
import java.io.*;
class Display{
    public String name;
    public String x;
    private Display(){
        x="Welcome Back";
    }
    public static Display getInstance(){
        return new Display();
    }
    public static String message(String name){
        return "Hello "+name;
    }

}
class SNG{
    public static void main(String[] args){
        Display obj=Display.getInstance();
        System.out.println((obj.hashCode()));
        String msg = Display.message("Arun");
        System.out.println(msg);
    }

}