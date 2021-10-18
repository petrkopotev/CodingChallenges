package org.challenge;

import org.junit.jupiter.api.Assertions;

public class RemoveNthFromTheEndOfTheList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode current = head;
        for(int i = 0; i < n; ++i) {
            current = current.next;
        }

        if (current == null) {
           return head.next;
        }

        ListNode toDelete = head;
        ListNode previous = toDelete;
        while(current != null) {
            current = current.next;
            previous = toDelete;
            toDelete = toDelete.next;
        }

        previous.next = toDelete.next;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode result = new RemoveNthFromTheEndOfTheList().removeNthFromEnd(head, 2);

        Assertions.assertEquals(1, result.val);
        Assertions.assertEquals(3, result.next.val);
    }
}
