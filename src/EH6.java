import java.io.*;
import java.util.*;
class EH6{
    public static void main(String[] args){
        Scanner sn=new Scanner("Hello");
        System.out.println(sn.next());
        System.out.println("Exception:"+sn.ioException());
    }
}
