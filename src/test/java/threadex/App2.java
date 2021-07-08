package threadex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(getRunnable("1"));
        executorService.submit(getRunnable("2"));
        executorService.submit(getRunnable("3"));
        executorService.submit(getRunnable("4"));
        executorService.submit(getRunnable("5"));
        executorService.shutdown();
    }

    private static Runnable getRunnable(String message) {
        return () -> System.out.println(message + "|" + Thread.currentThread().getName());
    }
}
