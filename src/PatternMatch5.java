//Program to show quantifiers

import java.io.*;
import java.util.regex.*;
class PatternMatch5{
    public static void main(String[] args){
        Pattern p=Pattern.compile(".");
        Matcher m=p.matcher("hhh");
        while(m.find()){
            System.out.println("Pattern found from "+m.start()+"to"+(m.end()-1));
        }
    }
}