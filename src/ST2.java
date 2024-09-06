import java.util.*;
import java.io.*;
class ST2{
    public static void main(String[] args){
        StringTokenizer str=new StringTokenizer("How are you");
        int count=str.countTokens();
        System.out.println("Total tokens:"+count);
        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }
        StringTokenizer s=new StringTokenizer("");
        System.out.println("For an empty string:"+s.hasMoreTokens());
    }
}