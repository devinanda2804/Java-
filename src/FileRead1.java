/*read from a file using Scanner */


import java.io.*;
import java.util.*;
class FileRead1{
    public static void main(String[] args) throws Exception{
        File fn=new File("C:\\Users\\devin\\file.txt");
        Scanner sn=new Scanner(fn);
        while(sn.hasNextLine()){
            System.out.println(sn.nextLine());
        }

    }
}
