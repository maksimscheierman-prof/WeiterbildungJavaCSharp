package T34_DateTimeUtils;

import java.util.Calendar;

public class DateCalendar {
    public static void main(String[] args) {

        Calendar start = Calendar.getInstance();
        start.set(2000, 0, 15);          // Januar = 0, verwirrend
        Calendar ende = Calendar.getInstance();
        ende.set(2025, 6, 1);            // Juli = 6

        long diffMillis = ende.getTimeInMillis() - start.getTimeInMillis();
        long tage = diffMillis / (1000 * 60 * 60 * 24);

        System.out.println("Tage zwischen den Daten: " + tage);
    }
}
