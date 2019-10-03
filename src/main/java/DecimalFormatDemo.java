import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalFormatDemo {
    private static DecimalFormat df = new DecimalFormat("#.###");

    public static void main(String[] args) {

        double input = 1.23456789;
        System.out.println(df.format(input));

        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println(df.format(input));

        df.setRoundingMode(RoundingMode.UP);
        System.out.println(df.format(input));


    }
}
