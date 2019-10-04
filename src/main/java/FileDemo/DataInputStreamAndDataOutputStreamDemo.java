package FileDemo;

import java.io.*;

public class DataInputStreamAndDataOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("contentFile2.dat"))) {
            // Write student test scores to the file
            output.writeUTF("Andrew");
            output.writeDouble(85.5);
            output.writeUTF("Jim");
            output.writeDouble(185.5);
        }

        try (
                DataInputStream input =
                        new DataInputStream(new FileInputStream("contentFile2.dat"));
        ) {
            // Read student test scores from the file
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        }
    }
}
