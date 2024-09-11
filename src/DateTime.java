//Program to show LocalDate
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.io.*;
class DateTime{
    public static void main(String[] args){
        LocalDate l= LocalDate.now();
        System.out.println("Date:"+l);
        LocalDate n=LocalDate.parse("2024-04-28");
        System.out.println("Date:"+n);
        LocalDate p=LocalDate.now().plusDays(1);
        System.out.println("Date:"+p);
        DayOfWeek s=LocalDate.parse("2024-09-11").getDayOfWeek();
        System.out.println("Day:"+s);
        int m=LocalDate.parse("2024-09-11").getDayOfMonth();
        System.out.println("Month:"+m);
        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println(leapYear);
    }
}