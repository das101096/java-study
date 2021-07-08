package exceptionex;

import org.junit.jupiter.api.Test;

public class exceptionexTest {

    @Test
    void autoCloseableTest() {
        try (AutoCloseable obj = new AutoCloseableObject()){
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
