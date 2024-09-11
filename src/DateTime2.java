//Program to show LocalDateTime
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
class DateTime2{
    public static void main(String[] args){
        LocalDateTime l=LocalDateTime.now();
        System.out.println(l);
        System.out.println(l.getMonth());
    }
}