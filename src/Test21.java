//Java program checking permissions in a file

import java.io.*;
import java.nio.*;
class Test21{
    public static void main(String[] args){
        try{
            File f=new File("C:\\Users\\devin\\file.docx");
            if(f.exists()){
                System.out.println("Is executable:"+f.canExecute());
                System.out.println("Is readable:"+f.canRead());
                System.out.println("Is writeable:"+f.canWrite());
            }
            else{
                System.out.println("File not found");
            }
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
