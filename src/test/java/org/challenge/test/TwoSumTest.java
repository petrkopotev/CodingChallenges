package org.challenge.test;

import org.challenge.TwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    @Test
    public void test() {
        Assertions.assertArrayEquals(new int[]{0, 1}, new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9));
        Assertions.assertArrayEquals(new int[]{1, 2}, new TwoSum().twoSum(new int[]{3,2,4}, 6));
        Assertions.assertArrayEquals(new int[]{0, 1}, new TwoSum().twoSum(new int[]{3, 3}, 6));
    }
}
