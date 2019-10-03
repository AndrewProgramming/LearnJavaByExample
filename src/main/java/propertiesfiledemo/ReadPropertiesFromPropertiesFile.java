package propertiesfiledemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFromPropertiesFile {

    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("db.properties");
            Properties properties = new Properties();
            properties.load(inputStream);

            System.out.println(properties.getProperty("db.user"));
            System.out.println(properties.getProperty("db.password"));
            System.out.println(properties.getProperty("db.url"));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
