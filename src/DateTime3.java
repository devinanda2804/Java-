//Program to show zoneId
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.*;
class DateTime3 {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);
    }
}