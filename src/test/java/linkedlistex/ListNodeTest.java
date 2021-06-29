package linkedlistex;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

class ListNodeTest {
    private List<Integer> array;
    private ListNode listNode;
    private static final int[] ADD_DATA = {1,2,4,3};

    @BeforeEach
    void init() {
        array = new ArrayList<>();

        listNode = new ListNode();
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);

        this.listNode = first;
        first.link = second;
        second.link = third;
    }
    @Test
    void add() {
        listNode = listNode.add(listNode, new ListNode(4), 2);

        while (listNode != null) {
            array.add(listNode.data);
            listNode = listNode.link;
        }

        for (int i = 0 ; i < array.size() ; i++) {
            Assertions.assertEquals(ADD_DATA[i], array.get(i));
        }
    }

    @Test
    void delete() {
        ListNode removeNode = listNode.remove(this.listNode,0);
        Assertions.assertEquals(1,removeNode.data);
    }

    @Test
    void contains() {
        boolean contains = listNode.contains(listNode, new ListNode(2));
        Assertions.assertEquals(contains,true);
    }

}