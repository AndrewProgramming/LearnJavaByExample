package csvdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CsvDemo {
    public static void main(String[] args) throws IOException {

        CsvDemo instance = new CsvDemo();

        instance.writeContentToCSVFile();
        instance.readContentFromCSVFile();

    }

    public void writeContentToCSVFile() throws IOException {

            List<List<String>> rows = Arrays.asList(
                    Arrays.asList("Learn Node.js", "Andrew", "programming Tutorial"),
                    Arrays.asList("Learn Scala", "Andrew", "programming Tutorial")

            );

            FileWriter csvWriter = new FileWriter("book.csv");
            csvWriter.append("Name");
            csvWriter.append(",");
            csvWriter.append("Author");
            csvWriter.append(",");
            csvWriter.append("Category");
            csvWriter.append("\n");

            for (List<String> rowData : rows) {
                csvWriter.append(String.join(",", rowData));
                csvWriter.append("\n");
            }
            csvWriter.close();
    }

    public void readContentFromCSVFile() throws IOException {
        try (BufferedReader input = new BufferedReader(new FileReader("book.csv"))) {
            String row;
            while ((row = input.readLine()) != null) {
                String[] data = row.split(",");
                for (int i = 0; i < data.length; i++) {
                    String comma = (i + 1 == data.length ? "" : ",");
                    System.out.print(data[i] + comma);
                }
                System.out.println();
            }
        }
    }
}
