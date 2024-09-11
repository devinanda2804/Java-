//Program demonstrating Duration and formatting of date

import java.time.*;

import java.time.format.DateTimeFormatter;
import java.util.*;
class DateTime5 {
    public static void main(String[] args) {
        LocalTime first=LocalTime.parse("06:30:00");
        LocalTime next=first.plus(Duration.ofSeconds(30));
        System.out.println(next);
        long n=Duration.between(first,next).getSeconds();
        System.out.println(n);
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
        String localDateString = localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(localDateString);


    }
}