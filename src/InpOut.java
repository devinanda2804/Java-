

import java.io.*;
import java.util.*;
/**
 * The {@code InpOut} class demonstrates how to copy the contents of one file
 * to another using Java's {@link FileInputStream} and {@link FileOutputStream}.
 * It reads the contents of "file.docx" and writes them to "textf.docx".
 */
class InpOut{
    /**
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args){
        FileInputStream f1=null;
        FileOutputStream f2=null;

        try{

            f1=new FileInputStream("file.docx");
            f2=new FileOutputStream("textf.docx");
            int temp;
            while((temp=f1.read())!=-1){
                f2.write((byte)temp);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if (f1 != null) {
                    f1.close();
                }

                if (f2 != null) {
                    f2.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }

}