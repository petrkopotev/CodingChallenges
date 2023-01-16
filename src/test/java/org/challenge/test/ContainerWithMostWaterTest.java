package org.challenge.test;

import org.challenge.ContainerWithMostWater;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {

    @Test
    public void test() {
        Assertions.assertEquals(49, new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        Assertions.assertEquals(1, new ContainerWithMostWater().maxArea(new int[]{1, 1}));
        Assertions.assertEquals(16, new ContainerWithMostWater().maxArea(new int[]{4, 3, 2, 1, 4}));
        Assertions.assertEquals(2, new ContainerWithMostWater().maxArea(new int[]{1, 2, 1}));
    }
}
