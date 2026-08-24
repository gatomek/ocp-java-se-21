package exam.r11;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {

        double d = 1234.567;
        println("n: " + d);
        println();

        pattern("#.#", d);
        pattern("##.##", d);
        pattern("###.###", d);
        pattern("####.####", d);
        pattern("#####.#####", d);

        println();

        pattern("0.0", d);
        pattern("00.00", d);
        pattern("000.000", d);
        pattern("0000.0000", d);
        pattern("00000.00000", d);

        println();

        pattern("#####.00000", d);
    }

    private static void pattern(String expr, double d) {
        NumberFormat f = new DecimalFormat(expr);
        println(expr + ": " + f.format(d));
    }

    private static void println(String txt) {
        System.out.println(txt);
    }

    private static void println() {
        System.out.println();
    }
}
