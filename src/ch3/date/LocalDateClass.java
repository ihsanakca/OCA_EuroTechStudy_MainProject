package ch3.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateClass {
    public static void main(String[] args) {


        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date = LocalDate.of(2025, 10, 25);
        System.out.println(date);

        LocalDate date1 = LocalDate.of(2028, Month.APRIL, 30);
        System.out.println("-----------------");
        System.out.println(date1);

        date1 = date1.plusDays(5);
        date1 = date1.plusWeeks(3);
        date1 = date1.plusMonths(1);
        date1 = date1.plusMonths(1);
        date1 = date1.plusYears(1);


        System.out.println(date1);

        System.out.println("-----------------");


        LocalTime time = LocalTime.of(20, 32);
        LocalTime time1 = LocalTime.of(20, 32,59);
        LocalTime time2 = LocalTime.of(15, 32, 11,25555);

        time2 = time2.plusMinutes(30);

        System.out.println(time2);
        time2 = time2.plusHours(1000);

        System.out.println(time2);

        System.out.println(time);
        System.out.println(time1);
        System.out.println(time2);

        LocalDateTime localDateTime = LocalDateTime.of(2021, Month.DECEMBER, 12, 20, 35, 2, 25);

        LocalDateTime localDateTime1 = LocalDateTime.of(date1, time1);

        System.out.println(localDateTime);
        System.out.println(localDateTime1);

        DateTimeFormatter benimPatern = DateTimeFormatter.ofPattern("yyyy-dd-MMM");
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(benimPatern.format(now));

        LocalDateTime ldt = LocalDateTime.of(2021, Month.DECEMBER, 12, 20, 35, 2, 25);

        System.out.println(ldt.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(ldt.format(DateTimeFormatter.ISO_TIME));
        System.out.println(ldt.format(DateTimeFormatter.ISO_DATE));

        LocalDate simdi = LocalDate.now();

        System.out.println(simdi.format(DateTimeFormatter.ISO_DATE));

        LocalTime now1 = LocalTime.now();
        System.out.println(now1.format(DateTimeFormatter.ISO_TIME));

        String format = LocalDateTime.parse("2024-12-10T15:12").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(format);


    }
}
