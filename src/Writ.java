// Java program illustrating the working of Writer class

import java.io.*;

public class Writ {
    public static void main(String[] args) throws IOException
    {
        char[] arr = { 'G', 'E', 'E', 'K', 'S' };
        Writer g1 = new PrintWriter(System.out);
        Writer g2 = new PrintWriter(System.out);
        Writer g3 = new PrintWriter(System.out);
        Writer g4 = new PrintWriter(System.out);
        Writer g5 = new PrintWriter(System.out);
        g1.write(65);
        g1.write(66);
        g1.write(70);
        g1.append("20");
        System.out.print("Using write: ");
        g1.flush();
        String str = "Hello Welcome";
        g2.write(str);
        System.out.print("\nUsing write(String str) : ");
        g2.flush();
        g3.write(str, 2, 4);
        g3.write(str, 5, 6);
        System.out.print("\nUsing write(str, offset, maxlen) : ");
        g3.flush();
        g4.write(arr);
        System.out.print("\nUsing write(char[] carray) : ");
        g4.flush();
        g5.write(arr, 1, 3);
        System.out.print("\nUsing write(carray, offset, maxlen) : ");
        g5.flush();
        g1.close();
        g2.close();
        g3.close();
        g4.close();
        g5.close();
    }
}
