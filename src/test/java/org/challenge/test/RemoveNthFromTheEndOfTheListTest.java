package org.challenge.test;

import org.challenge.RemoveNthFromTheEndOfTheList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveNthFromTheEndOfTheListTest {

    @Test
    public void test() {
        RemoveNthFromTheEndOfTheList.ListNode head = new RemoveNthFromTheEndOfTheList.ListNode(1);
        head.next = new RemoveNthFromTheEndOfTheList.ListNode(2);
        head.next.next = new RemoveNthFromTheEndOfTheList.ListNode(3);

        RemoveNthFromTheEndOfTheList.ListNode result = new RemoveNthFromTheEndOfTheList().removeNthFromEnd(head, 2);

        Assertions.assertEquals(1, result.val);
        Assertions.assertEquals(3, result.next.val);
    }
}
