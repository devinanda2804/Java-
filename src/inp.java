import java.io.*;

class Text{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bfn=new BufferedReader(new InputStreamReader(System.in));
        String str=bfn.readLine();
        int num=Integer.parseInt(bfn.readLine());
        System.out.println("The string is:"+str);
        System.out.println("The number is:"+num);
    }

}