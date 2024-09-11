import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import java.time.Period;
import java.util.*;
class DateTime4 {
    public static void main(String[] args) {
     LocalDate first=LocalDate.parse("2024-09-12");
     LocalDate next=first.plus(Period.ofDays(5));
     System.out.println(next);
     int n=Period.between(first,next).getDays();
     System.out.println(n);

    }
}