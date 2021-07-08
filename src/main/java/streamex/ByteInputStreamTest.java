package streamex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ByteInputStreamTest {
    public static void main(String[] args) {
        int count = 0;

        try {
            int ReadByte;
            byte[] size = new byte[5];
            InputStream inputStream = new FileInputStream("a.txt");

            while ((ReadByte = inputStream.read(size,1,3)) != -1){
                for (byte b : size) {
                    System.out.print((char) b);
                }
                System.out.print("이번 루프에 읽은 바이트 수 : "+ReadByte);
                System.out.println();
                count++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("루프 횟수 : "+count);
    }
}
