//Program showing built in exceptions

import java.util.*;
import java.io.*;
class EH4{
    public static void main(String[] args){
        try{
            String s="Good Morning";
            int n=s.charAt(30);
            System.out.println(n);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
