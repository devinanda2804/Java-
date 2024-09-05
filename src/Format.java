import java.io.*;
import java.util.*;
class Format{
    public static void main(String[] args){
        int a=100000;
        System.out.printf("%d\n",a);
        double b=1.6123549;
        System.out.printf("%f\n",b);
        System.out.printf("%5.2f\n",b);
        Date time=new Date();
        System.out.printf("%tT\n ",time);
        System.out.printf("Hours:%tH Minutes:%tM Seconds:%tS\n",time,time,time);



    }
}