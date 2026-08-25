package exam.r11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class FormattingDatesAndTimes {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.of(1982, Month.JANUARY, 25);
        LocalTime lt = LocalTime.of(19, 30, 15);
        LocalDateTime ldt = LocalDateTime.of(ld, lt);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        println(formatter.format(ldt));
        println(ldt.format(formatter));

        println(ldt.format(DateTimeFormatter.ofPattern("M")));
        println(ldt.format(DateTimeFormatter.ofPattern("MM")));
        println(ldt.format(DateTimeFormatter.ofPattern("MMM")));
        println(ldt.format(DateTimeFormatter.ofPattern("MMMM")));

        println();
        println(ldt.format(DateTimeFormatter.ofPattern("'What a month: 'MMMM'!!!'")));
		
		println();
        println(lt.format(DateTimeFormatter.ofPattern("HH:mm")));
        println(lt.format(DateTimeFormatter.ofPattern("hh:mm a")));
    }

    private static void println(String txt) {
        System.out.println(txt);
    }

    private static void println() {
        System.out.println();
    }
}
