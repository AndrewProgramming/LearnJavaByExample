package FileDemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = null;

        File file = new File("bufferedWriterDemoFile.txt");
        FileWriter fw = new FileWriter(file);


        String myContent = "Andrew Programming is great programming tutorial website";

        if (!file.exists()) {
            file.createNewFile();
        }


        bw = new BufferedWriter(fw);
        bw.write(myContent);
        System.out.println("File written Successfully");

        bw.close();
    }
}
