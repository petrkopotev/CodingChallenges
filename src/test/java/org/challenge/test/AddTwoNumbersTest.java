package org.challenge.test;


import org.challenge.AddTwoNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.challenge.AddTwoNumbers.prepare;
import static org.challenge.AddTwoNumbers.toArray;

public class AddTwoNumbersTest {

    @Test
    @Disabled
    public void test() {
        Assertions.assertArrayEquals(new int[]{7, 0, 8}, toArray(new AddTwoNumbers().addTwoNumbers(prepare(new int[]{2, 4, 3}), prepare(new int[]{5, 6, 4}))));
        Assertions.assertArrayEquals(new int[]{8, 9, 9, 9, 0, 0, 0, 1}, toArray(new AddTwoNumbers().addTwoNumbers(prepare(new int[]{9, 9, 9, 9, 9, 9, 9}), prepare(new int[]{9, 9, 9, 9}))));
    }
}
