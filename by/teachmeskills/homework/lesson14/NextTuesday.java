package by.teachmeskills.homework.lesson14;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class NextTuesday {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        Calendar now = Calendar.getInstance();
        int weekday = now.get(Calendar.DAY_OF_WEEK);

        int days = (Calendar.SATURDAY - weekday + dayOfWeek) % 7;
        now.add(Calendar.DAY_OF_YEAR,days);

        Date date = now.getTime();
        String dateStr = new SimpleDateFormat("dd.MM.yyyy").format(date);
        System.out.println("dateStr = " + dateStr);
    }
}
