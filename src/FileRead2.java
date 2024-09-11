/*read from a file using Buffered Reader
*/

import java.io.*;
import java.util.*;
class FileRead2{
    public static void main(String[] args) throws Exception{
        File fn=new File("C:\\Users\\devin\\file.txt");
        BufferedReader bn=new BufferedReader(new FileReader(fn));
        String str;
        while((str=bn.readLine())!=null){
            System.out.println(str);
        }

    }
}
