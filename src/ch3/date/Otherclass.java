package ch3.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Otherclass {

    int i;
    String str;

    public Otherclass(int i, String str) {
        this.i = i;
        this.str = str;
    }

    @Override
    public String toString() {
        return i +" "+ str;
    }

    public static void main(String[] args) {

        Otherclass o4 = new Otherclass(25,"Asa");
        System.out.println(o4.toString());
        System.out.println(o4);


        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());


        LocalDate date = LocalDate.of(2025, 10, 6);
        System.out.println(date);
        LocalDate date1 = LocalDate.of(5, Month.APRIL, 30);
        System.out.println(date1);

        LocalTime time = LocalTime.of(2, 3);
        LocalTime time1 = LocalTime.of(2, 3, 10);
        LocalTime time2 = LocalTime.of(2, 3, 10, 554);

        System.out.println(time);
        System.out.println(time1);
        System.out.println(time2);

        LocalDateTime localDateTime = LocalDateTime.of(2024, 2, 5, 7, 40, 50);
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(date1,time1);
        System.out.println(localDateTime1);

        LocalDate date22 = LocalDate.of(2020, Month.JANUARY, 20);
        //date = date22.plusMinutes(1); // DOES NOT COMPILE

        System.out.println(date22);

        DateTimeFormatter benimPatern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter benimPatern2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        System.out.println(benimPatern.format(date22));
        System.out.println(benimPatern2.format(date22));

        LocalDate date66 = LocalDate.parse("2024-01-22");
        System.out.println(date66);




    }
}
