import java.util.*;
import java.io.*;
class SubString{
    public static void main(String[] args){
            Scanner sn=new Scanner(System.in);
            System.out.print("S=");
            String str=sn.next();
            System.out.print("L=");
            int L=sn.nextInt();
            System.out.print("R=");
            int R=sn.nextInt();
            StringBuilder s=new StringBuilder();
            for(int i=L;i<=R;i++){
                s.append(str.charAt(i));
            }
            System.out.println(s);

    }

}