package date_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClaseCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, calendar.SEPTEMBER, 1);
        Date fecha = calendar.getTime();
        SimpleDateFormat sf = new SimpleDateFormat("EEEE, dd/MMMMM/yyyy");
        String nuevaFecha = sf.format(fecha);
        System.out.println("fecha = " + nuevaFecha);
    }
}
