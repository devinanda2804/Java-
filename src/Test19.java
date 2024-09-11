
// Java program to delete a file
import java.io.*;


public class Test19 {
    public static void main(String[] args)
    {
        File f = new File("C:\\Users\\devin\\file.docx");

        if (f.delete()) {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("Failed to delete the file");
        }
    }
}
