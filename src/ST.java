import java.util.*;
import java.io.*;
class ST{
    public static void main(String[] args){
        StringBuffer str=new StringBuffer();
        str.append("Good");
        str.append(" ");
        str.append("Morning");
        System.out.println(str);
        str.insert(4,"d");
        System.out.println(str);
        str.replace(0,5,"Hello");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        System.out.println(str.charAt(4));
    }
}