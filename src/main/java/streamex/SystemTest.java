package streamex;

import java.io.*;

public class SystemTest {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("a.txt");
             PrintStream ps = new PrintStream(fos)){

            System.setOut(ps); // System.out의 출력 대상을 a.txt 파일로 변경
            System.out.println("out - test out");
            System.err.println("out - test err");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
