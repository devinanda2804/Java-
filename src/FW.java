//Java program showing FileWriter

import java.io.*;
import java.util.*;
class FW{
    public static void main(String[] args){
        try{
        String s="Good Morning";
        FileWriter f=new FileWriter("C:\\Users\\devin\\file.docx");
        for(int i=0;i<s.length();i++){
            f.write(s.charAt(i));
        }
        System.out.println("Successfully written");
        f.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
