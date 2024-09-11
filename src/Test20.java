
// Java program to delete a file
import java.io.*;

import java.nio.file.*;
class Test20{
    public static void main(String[] args){
        try {
            Files.deleteIfExists(Paths.get("C:\\Users\\devin\\file.docx"));
        }
        catch(IOException e){
            System.out.println("No such file");
        }
    }
}
