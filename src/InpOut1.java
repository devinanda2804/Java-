import java.io.*;
import java.util.*;

/**
 * The {@code InpOut1} class demonstrates how to read a file and print its contents to the console.
 */
class InpOut1{
     /** @param args command-line arguments (not used in this program)
     * @throws IOException if there is an issue opening or closing the file
     */
    public static void main(String[] args) throws IOException{
        FileReader f1=null;
        try{
            f1=new FileReader("file.txt");
            int temp;
            while((temp=f1.read())!=-1){
                System.out.println((char)temp);
            }
        }
        finally {
            if(f1!=null)
                f1.close();
        }
    }
}