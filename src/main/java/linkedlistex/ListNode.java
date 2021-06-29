package linkedlistex;


public class ListNode {

    int data;
    ListNode link;

    public ListNode() {
    }

    public ListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        ListNode node = head;

        for(int i = 0; i < position -1 ; i++) {
            node = node.link;
        }

        nodeToAdd.link = node.link;
        node.link = nodeToAdd;
        return head;
    }

    public ListNode remove(ListNode head, int positionToRemove) {
        ListNode node = head;

        if(positionToRemove == 0) {
            ListNode deleteNode = node;
            head = node.link;
            deleteNode.link = null;
            return deleteNode;
        }

        for(int i = 0; i < positionToRemove -1 ; i++) {
            node = node.link;
        }
        ListNode deleteNode = node.link;
        node.link = deleteNode.link;
        deleteNode.link = null;
        return deleteNode;
    }

    boolean contains(ListNode head, ListNode nodeTocheck) {
        while(head.link != null){
            if(head.link == nodeTocheck) {
                return true;
            }
            head = head.link;
        }
        return false;
    }

}
