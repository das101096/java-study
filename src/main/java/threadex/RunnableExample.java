package threadex;

public class RunnableExample {
public static void main(String[] args) {
    System.out.println("Current thread : "+Thread.currentThread().getName());
    Thread thread = new Thread(() -> {
        System.out.println("Thread run by Runnable");
        System.out.println("Current thread : "+Thread.currentThread().getName());
    });
    thread.run();
    thread.run();
}
}
