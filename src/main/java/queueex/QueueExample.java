package queueex;

import java.util.NoSuchElementException;

public class QueueExample {
    private int[] array;
    private int maxSize;
    private int front;
    private int rear;

    QueueExample() {
        final int DEFAULT_QUEUE_SIZE = 11;
        this.array = new int[DEFAULT_QUEUE_SIZE];
        this.maxSize = DEFAULT_QUEUE_SIZE;
        this.front = 0;
        this.rear = 0;
    }

    public QueueExample(int maxSize) {
        this.array = new int [maxSize + 1];
        this.maxSize = maxSize + 1;
        this.front = 0;
        this.rear = 0;
    }

    public boolean enQueue(int data) {
        if ((this.rear + 1) % this.maxSize == this.front)
            throw new IllegalStateException("full");

        this.rear = (this.rear + 1) % this.maxSize;
        this.array[this.rear] = data;

        return true;
    }

    public Integer deQueue() {
        if(this.front == this.rear){
            throw new NoSuchElementException();
        }
        int removed = element();
        this.front = (this.front + 1) % this.maxSize;
        return removed;
    }

    public Integer element() {
        if(this.front == this.rear) throw new NoSuchElementException("Queue is empty...");
        return this.array[(this.front + 1) % this.maxSize];
    }
}
