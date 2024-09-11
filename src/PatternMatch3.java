//Program using pattern()
import java.io.*;
import java.util.regex.*;
class PatternMatch3{
    public static void main(String[] args){
        String rex="(.)*for(.)";
        Pattern p=Pattern.compile(rex);
        String str=p.pattern();
        System.out.println(str);
    }
}
