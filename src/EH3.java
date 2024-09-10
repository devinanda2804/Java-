//Program showing built in exceptions


import java.util.*;
import java.io.*;
class EH3{
    public static void main(String[] args){
        try{
            String s=null;
            System.out.println(s.charAt(0));
        }
        catch(NullPointerException e){
            System.out.println("String is null");
        }
    }
}
