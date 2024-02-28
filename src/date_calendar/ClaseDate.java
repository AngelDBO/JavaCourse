package date_calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClaseDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat sf = new SimpleDateFormat("EEEE, dd/MMMMM/yyyy");
        String str = sf.format(fecha);

        long j = 0;
        for (int i = 0; i < 10000000; i++){
            j += i;
        }
        System.out.println("j = " + j);

        Date date2 = new Date();
        long tiempoTranscurrido = date2.getTime() - fecha.getTime();

        System.out.println("str = " + str);
        System.out.println("tiempoTranscurrido = " + tiempoTranscurrido + " ms");
    }
}
