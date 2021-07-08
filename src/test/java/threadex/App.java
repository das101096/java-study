package threadex;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Summoner extends Thread {
    int farmingCnt = 0;
    long sleep = 0;
    Global global;

    public Summoner(String name, Global global) {
        super(name);
        this.global = global;
    }

    @Override
    public void run() {

        if (sleep == 0)
            sleep = 1000L;

        while (!interrupted()){
            try {
                Thread.sleep(sleep);
                farmingCnt++;
                System.out.println(getName() + "f count : " + farmingCnt);
                global.setGold(global.getGold()+10);
            } catch (InterruptedException e) {
                delay(5000);
            }
        }
    }

    public void delay(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Global {
    int gold;

    public Global() {
        this.gold = 0;
    }

    public synchronized int getGold() {
        return gold;
    }

    public synchronized void setGold(int gold)  {
        try {
            Thread.sleep(500);
            this.gold = gold;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
public class App {
    public static void main(String[] args) {

        Global g = new Global();
        Summoner s1 = new Summoner("s1",g);
        Summoner s2 = new Summoner("s2",g);

        s1.start();
        s2.start();
        ReentrantLock reentrantLock = new ReentrantLock();

        while (true) {
            try {
                Thread.sleep(500);
                System.out.println("Global Gold : " + g.getGold() );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
