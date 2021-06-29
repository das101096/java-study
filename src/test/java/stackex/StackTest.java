package stackex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    private Stack stack;
    private static final int[] PUSH_DATA = {5,4,3,2,1};
    
    @Test
    void push() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        for (int i=0;i<PUSH_DATA.length;i++) {
            Assertions.assertEquals(PUSH_DATA[i],stack.pop());
        }
    }

}
