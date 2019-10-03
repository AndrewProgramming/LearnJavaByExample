public class StringFormatExample {

    public static void main(String[] args) {

        double input = 1.23456789;
        System.out.println("double : " + String.format("%.2f", input));
        System.out.format("double : %.2f", input);

    }

}