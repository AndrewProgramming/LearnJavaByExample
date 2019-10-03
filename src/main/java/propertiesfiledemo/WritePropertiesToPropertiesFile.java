package propertiesfiledemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WritePropertiesToPropertiesFile {
    public static void main(String[] args) {
        OutputStream outputStream  = null;

        try {
            outputStream = new FileOutputStream("db.properties");

            Properties prop = new Properties();

            // set the properties value
            prop.setProperty("db.url", "www.andrew-programming.com");
            prop.setProperty("db.user", "andrew_programming_");
            prop.setProperty("db.password", "andrew_programming_password");

            // save properties to project root folder
            prop.store(outputStream, null);

            System.out.println(prop);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
