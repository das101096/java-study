package exceptionex;

public class AutoCloseableObject implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("close");
    }
}
