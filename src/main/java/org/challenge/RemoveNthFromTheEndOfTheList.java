package org.challenge;

public class RemoveNthFromTheEndOfTheList {

    public static class ListNode {
        public int val;
        public ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
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
}
