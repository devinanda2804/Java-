/*read from a file using FileReader
 */


import java.io.*;
import java.util.*;
class FileRead3{
    public static void main(String[] args) throws Exception{
        FileReader f=new FileReader("C:\\Users\\devin\\file.txt");
        int i;
        while((i=f.read())!=-1){
            System.out.println(i);
        }

    }
}
