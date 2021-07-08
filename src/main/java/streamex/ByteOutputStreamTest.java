package streamex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteOutputStreamTest {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("abc.txt");
            byte[] name = "daseul".getBytes();
            outputStream.write(name);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
