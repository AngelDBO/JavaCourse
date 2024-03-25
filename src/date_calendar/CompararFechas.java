package date_calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompararFechas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato > YYYY-MM-DD ");

        try {
            Date date = sf.parse(scanner.next());
            System.out.println("date = " + date);
            System.out.println("sf.format(date) = " + sf.format(date));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);


            if (date.after(fecha2)) {
                System.out.println("FDecha del usuario es despues de fecha 2");
            } else if (date.before(fecha2)) {
                System.out.println("Fecha es anterior que fecha2");
            } else if (date.equals(fecha2)) {
                System.out.println("Ambas fechas son igual");
            }
            System.out.println("date2 = " + (fecha2.getTime() - date.getTime()));

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
