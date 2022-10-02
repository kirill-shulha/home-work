package by.teachmeskills.homework.lesson14;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;


public class WeekDay {
    public static void main(String[] args) {
        DayOfWeek dow = LocalDate.of(2022, Month.SEPTEMBER,26).getDayOfWeek();
        String s = String.valueOf(dow);
        System.out.println(String.format("%.3s",s));
    }
}
