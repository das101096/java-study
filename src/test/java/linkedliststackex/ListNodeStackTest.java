package linkedliststackex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListNodeStackTest {
    ListNodeStack listNodeStack;
    private static final int[] ADD_DATA = {5,4,3,2,1};

    @Test
    void Test() {
        listNodeStack = new ListNodeStack();
        listNodeStack.push(1);
        listNodeStack.push(2);
        listNodeStack.push(3);
        listNodeStack.push(4);
        listNodeStack.push(5);

        for(int i=0; i<ADD_DATA.length; i++) {
            Assertions.assertEquals(ADD_DATA[i],listNodeStack.pop());
        }
    }
}
