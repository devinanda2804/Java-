//Program to show LocalTime
import java.io.*;
import java.time.LocalTime;
import java.util.*;
class DateTime1{
    public static void main(String[] args){
        LocalTime l=LocalTime.now();
        System.out.println("Time:"+l);
        LocalTime sixThirty = LocalTime.parse("06:30");
        System.out.println(sixThirty);
        int n=LocalTime.parse("06:30").getHour();
        System.out.println(n);
        LocalTime maxTime = LocalTime.MAX;
        System.out.println(maxTime);
    }
}