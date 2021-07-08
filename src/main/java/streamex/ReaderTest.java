package streamex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.Writer;

public class ReaderTest {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("abc.txt");
        int readData;
        int readCount = 0;
        char[] chars = new char[10];

        while ((readData = reader.read(chars)) != -1) {
            for (char aChar : chars) {
                System.out.print((char) aChar);
            }
            System.out.println();
            System.out.println("읽어온 문자 수 : " +readData);
            readCount++;
        }
        System.out.println();
        System.out.println("읽어온 횟수 : " + readCount);
    }

}
