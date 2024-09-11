//Program to print the index from where the texts starts

import java.io.*;
import java.util.regex.*;
class PatterMatch1{
    public static void main(String[] args){
        Pattern p=Pattern.compile("Morning");
        Matcher m=p.matcher("Good Morning");
        while(m.find()){
            System.out.println("Pattern found from "+m.start()+" to "+(m.end() -1));
        }
    }
}