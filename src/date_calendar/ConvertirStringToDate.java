package date_calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConvertirStringToDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con el siguiente formato: yyyy-MM-dd");

        try {
            Date date = sf.parse(scanner.nextLine());
            System.out.println("date = " + date);
            System.out.println("sf.format(date) = " + sf.format(date));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}