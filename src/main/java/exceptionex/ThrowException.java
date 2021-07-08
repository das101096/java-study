package exceptionex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class aClass = Class.forName(className);
        return aClass;
    }

    public static void main(String[] args) {
        ThrowException ex = new ThrowException();
        try {
            ex.loadClass("b.txt", "java.lang.string");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
