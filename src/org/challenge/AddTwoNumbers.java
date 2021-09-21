package org.challenge;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class AddTwoNumbers {

    public static void main(String[] s) {
        Assertions.assertArrayEquals(new int[]{7, 0, 8}, toArray(new AddTwoNumbers().addTwoNumbers(prepare(new int[]{2, 4, 3}), prepare(new int[]{5, 6, 4}))));
        Assertions.assertArrayEquals(new int[]{8, 9, 9, 9, 0, 0, 0, 1}, toArray(new AddTwoNumbers().addTwoNumbers(prepare(new int[]{9, 9, 9, 9, 9, 9, 9}), prepare(new int[]{9, 9, 9, 9}))));
    }

    private static int[] toArray(ListNode node) {
        ArrayList<Integer> list = new ArrayList<>();
        do {
            list.add(node.val);
            node = node.next;
        } while (node != null);

        return list.stream().mapToInt(i -> i).toArray();
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode current = head;
        while (true) {
            int value = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            current.val += value % 10;
            int overflow = current.val / 10 + value / 10;
            current.val %= 10;
            if (overflow > 0 || l1 != null && l1.next != null || l2 != null && l2.next != null) {
                current.next = new ListNode(overflow, null);
                current = current.next;
                if (l1 != null && l1.next != null) {
                    l1 = l1.next;
                } else {
                    l1 = null;
                }

                if (l2 != null && l2.next != null) {
                    l2 = l2.next;
                } else {
                    l2 = null;
                }
            } else {
                break;
            }
        }

        return head;
    }

    private static ListNode prepare(int[] input) {
        ListNode head = new ListNode();
        ListNode current = head;
        for (int i = 0; i < input.length; ++i) {
            current.val = input[i];
            current.next = new ListNode();
            current = current.next;
        }

        return head;
    }

    private static class ListNode {
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
}
