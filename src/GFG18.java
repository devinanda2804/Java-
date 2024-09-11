// Java Program to create new file using FileOutputStream class

import java.io.*;
public class GFG18 {
    public static void main(String args[])
    {
        GFG18 gfg = new GFG18();
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
            FileOutputStream f1 = new FileOutputStream(strPath + "" + strName + ".txt");

        }
        catch (Exception e) {
        }
    }
}
