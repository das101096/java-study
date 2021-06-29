package queueex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueExampleTest {
    final int FIRST_DATA_VALUE = 1;
    final int SECOND_DATA_VALUE = 2;
    final int THIRD_DATA_VALUE = 3;

    @Test
    void enqueue() {
        QueueExample queue = new QueueExample();
        Assertions.assertAll(
                () -> Assertions.assertTrue(queue.enQueue(FIRST_DATA_VALUE)),
                () -> Assertions.assertTrue(queue.enQueue(SECOND_DATA_VALUE)),
                () -> Assertions.assertTrue(queue.enQueue(THIRD_DATA_VALUE))
        );
    }

    @Test
    void dequeue() {
        QueueExample queue = new QueueExample();

        Assertions.assertAll(
                () -> Assertions.assertTrue(queue.enQueue(FIRST_DATA_VALUE)),
                () -> Assertions.assertTrue(queue.enQueue(SECOND_DATA_VALUE)),
                () -> Assertions.assertTrue(queue.enQueue(THIRD_DATA_VALUE)),

                () -> {
                    int removed = queue.deQueue();
                    Assertions.assertEquals(removed, FIRST_DATA_VALUE);
                },
                () -> {
                    int removed = queue.deQueue();
                    Assertions.assertEquals(removed, SECOND_DATA_VALUE);
                },
                () -> {
                    int removed = queue.deQueue();
                    Assertions.assertEquals(removed, THIRD_DATA_VALUE);
                }
        );
    }
}
