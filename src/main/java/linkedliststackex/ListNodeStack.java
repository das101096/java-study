package linkedliststackex;

import linkedlistex.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ListNodeStack {
    static int top;
    ListNode node;

    public ListNodeStack() {
        this.node = null;
        this.top = -1;
    }

    public void push(int data) {
        ListNode pushNode = new ListNode(data);

        if(node == null) {
            node = new ListNode(data);
            top++;
        } else {
            node = node.add(node,pushNode,++top);
        }
    }

    public int pop() {
        if(top == -1) {
            return top;
        } else {
            return node.remove(node,top--).getData();
        }
    }

}
