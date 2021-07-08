package threadex;

import java.util.concurrent.locks.Lock;

class ThreadTestMain {
public static void main(String[] args) {
    FirstThreadTest firstThreadTest = new FirstThreadTest();
    firstThreadTest.start();

    synchronized (args) {

    }
}

public synchronized int sum(int a, int b) {
    return a+b;
}
}

class SecondThreadTest extends Thread{
    @Override
    public void run() {
        for (int i=0;i < 200; i++) {
            System.out.print("loop ");
        }
    }
}

public class FirstThreadTest extends Thread{
    @Override
    public void run() {
        for (int i=0;i < 200; i++) {
            System.out.print("thread1 ");
        }
    }
}
