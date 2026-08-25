package exam.r11;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

public class CompactNumberFormatKata {

    public static void main(String[] args) {

        System.out.println("Auto rounding");

        NumberFormat f1 = NumberFormat.getCompactNumberInstance();

        double d1 = 13434.5678;
        System.out.println(d1 + " -> " + f1.format(d1));

        double d2 = 13534.5678;
        System.out.println(d2 + " -> " + f1.format(d2));

        NumberFormat f2 = NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.SHORT);
        NumberFormat f3 = NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.LONG);

        System.out.println("Short style");
        System.out.println(d1 + " -> " + f2.format(d1));

        System.out.println("Long style");
        System.out.println(d2 + " -> " + f3.format(d1));

        System.out.println("---");

        System.out.print("Short style in Polish:  ");
        NumberFormat f4 = NumberFormat.getCompactNumberInstance(Locale.of("pl", "PL"), Style.SHORT);
        System.out.println(f4.format(d1));

        System.out.print("Short style in German:  ");
        NumberFormat f5 = NumberFormat.getCompactNumberInstance(Locale.GERMANY, Style.SHORT);
        System.out.println(f5.format(d1));

        System.out.print("Short style in English: ");
        NumberFormat f6 = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, Style.SHORT);
        System.out.println(f6.format(d1));

        System.out.print("Short style in French:  ");
        NumberFormat f7 = NumberFormat.getCompactNumberInstance(Locale.FRENCH, Style.SHORT);
        System.out.println(f7.format(d1));

        System.out.println("---");

        System.out.print("Long style in Polish:  ");
        NumberFormat f8 = NumberFormat.getCompactNumberInstance(Locale.of("pl", "PL"), Style.LONG);
        System.out.println(f8.format(d1));

        System.out.print("Long style in German:  ");
        NumberFormat f9 = NumberFormat.getCompactNumberInstance(Locale.GERMANY, Style.LONG);
        System.out.println(f9.format(d1));

        System.out.print("Long style in English: ");
        NumberFormat f10 = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, Style.LONG);
        System.out.println(f10.format(d1));

        System.out.print("Long style in French:  ");
        NumberFormat f11 = NumberFormat.getCompactNumberInstance(Locale.FRENCH, Style.LONG);
        System.out.println(f11.format(d1));
    }
}
