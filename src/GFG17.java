// Java Program to create new file using File class

import java.io.*;
public class GFG17 {
    public static void main(String args[])
    {
        GFG17 gfg = new GFG17();
        gfg.newFile();
    }
    public void newFile()
    {
        String strPath = "", strName = "";
        try {

            // Creating BufferedReadered object
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the file name:");
            strName = br.readLine();
            System.out.println("Enter the file path:");
            strPath = br.readLine();
            File file = new File(strPath + "" + strName + ".txt");
            file.createNewFile();
        }
        catch (Exception ex1) {
        }
    }
}
