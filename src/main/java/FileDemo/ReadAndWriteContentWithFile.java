package FileDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteContentWithFile {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream out = new FileOutputStream("contentFile.dat")) {
            for (int i = 1; i < 10; i++) {
                out.write(i);
            }
        }
        try (FileInputStream input = new FileInputStream("contentFile.dat")) {
            int v;
            while ((v = input.read()) != -1) {
                System.out.print(v);
            }
        }
    }
}
