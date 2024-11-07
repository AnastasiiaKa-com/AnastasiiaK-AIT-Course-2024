package Classwork_34.time_apl_ex;

import java.sql.Date;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class TimeAppl {
    public static void main(String[] args) {

        //How much time? - ISO format: YYYY-mm-DD
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println();

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println("___________________________________");

        LocalDate gagarin = LocalDate.of(1961,10,12);

        System.out.println(gagarin);// ISO

        //Какой это был день недели
        System.out.println( gagarin.getDayOfWeek());
        //Какой это был день года?
        System.out.println(gagarin.getDayOfYear());
        //......
        System.out.println("______________________ Is leap year? ___________________________");
        int year = 2024;
        System.out.println(" Is year " + year + " leap: " + Year.isLeap(year));
        System.out.println("________________________________________________________________");
        System.out.println(gagarin.isBefore(ld)); // true
        System.out.println(gagarin.isAfter(ld));// false
        System.out.println("_________________________________________________________________");
        Long period = ChronoUnit.YEARS.between(gagarin,ld);
        System.out.println(period);// 63


        System.out.println("______________DateTimeFormatter____________");
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;// YYYY-mm-DD
        String date = gagarin.format(df);// LocalDate to String
        System.out.println(date);

        //выбираем другой формат
        df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = gagarin.format(df);
        System.out.println(date);

        //задаем другой собственный формат строки с датой
        System.out.println("_________________________________________________________________");
        df = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        date = gagarin.format(df);
        System.out.println(date);

        //задаем locale
        df = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);
        date = gagarin.format(df);
        System.out.println(date);

        //parsing localDate from String
        System.out.println("////////////////////////////////////////////////////////////////////////");
        String stringDate = "01/12/2024";
        LocalDate result = LocalDate.parse(stringDate,DateTimeFormatter.ofPattern("[dd:MM:yyyy][dd/MM/yyyy][dd-MM-yyyy]"));
        System.out.println(result);// ISD format

    }
}
