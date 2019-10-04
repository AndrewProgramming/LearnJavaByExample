package FileDemo;

import java.io.*;

public class BufferedOutputStreamAndBufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("contentFile3.dat")))) {
            output.writeUTF("Andrew Programming");
            output.writeDouble(100.00);
        }


        try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream("contentFile3.dat")))) {
            System.out.println(input.readUTF());
            System.out.println(input.readDouble());
        }
    }
}
