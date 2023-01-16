package org.challenge.test;

import org.challenge.ThreeSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ThreeSumTest {

    @Test
    public void test() {
        List<List<Integer>> results = new ThreeSum().threeSum(new int[]{-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0});
        Assertions.assertArrayEquals(new Integer[]{-5, 1, 4}, results.get(0).toArray(new Integer[0]));
        Assertions.assertArrayEquals(new Integer[]{-4, 0, 4}, results.get(1).toArray(new Integer[0]));
        Assertions.assertArrayEquals(new Integer[]{-4, 1, 3}, results.get(2).toArray(new Integer[0]));
        Assertions.assertArrayEquals(new Integer[]{-2, -2, 4}, results.get(3).toArray(new Integer[0]));
        Assertions.assertArrayEquals(new Integer[]{-2, 1, 1}, results.get(4).toArray(new Integer[0]));
        Assertions.assertArrayEquals(new Integer[]{0, 0, 0}, results.get(5).toArray(new Integer[0]));

        List<List<Integer>> results1 = new ThreeSum().threeSum(new int[]{-1,0,1,2,-1,-4});
        Assertions.assertArrayEquals(new Integer[]{-1, -1, 2}, results1.get(0).toArray(new Integer[0]));
        Assertions.assertArrayEquals(new Integer[]{-1, -0, 1}, results1.get(1).toArray(new Integer[0]));
    }
}
