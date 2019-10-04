package csvdemo;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OpenCsvDemo {
    public static void main(String[] args) throws IOException {
       OpenCsvDemo instance  = new OpenCsvDemo();
       instance.writeToCsvFile();
       instance.readFromCsvFile();
    }

    public void readFromCsvFile() throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader("contact.csv"));
        List<String[]> list = new ArrayList<>();

        String[] line;
        while ((line = csvReader.readNext()) != null) {
            for (int i = 0; i < line.length; i++) {
                String comma = (i + 1 == line.length ? "" : ",");
                System.out.print(line[i] + comma);

            }
            System.out.println();
            list.add(line);
        }
        csvReader.close();
    }


    public void writeToCsvFile() throws IOException {
        try (
                Writer writer = Files.newBufferedWriter(Paths.get("contact.csv"));

                CSVWriter csvWriter = new CSVWriter(writer,
                        CSVWriter.DEFAULT_SEPARATOR,
                        CSVWriter.NO_QUOTE_CHARACTER,
                        CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                        CSVWriter.DEFAULT_LINE_END);
        ) {
            String[] headerRecord = {"Name", "Email", "Phone", "Country"};
            csvWriter.writeNext(headerRecord);

            csvWriter.writeNext(new String[]{"Sundar Pichai ♥", "sundar.pichai@gmail.com", "+1-1111111111", "India"});
            csvWriter.writeNext(new String[]{"Satya Nadella", "satya.nadella@outlook.com", "+1-1111111112", "India"});
        }
    }
}
