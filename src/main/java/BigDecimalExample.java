import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {

    public static void main(String[] args) {

        double input = 1.23456789;
        System.out.println("double : " + input);

        BigDecimal bd = new BigDecimal(input).setScale(2, RoundingMode.HALF_UP);
        double newInput = bd.doubleValue();

        System.out.println("double : " + newInput);

    }

}