package org.challenge;

import org.junit.jupiter.api.Assertions;

public class ContainerWithMostWater {

    public static void main(String[] s) {
        Assertions.assertEquals(49, new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        Assertions.assertEquals(1, new ContainerWithMostWater().maxArea(new int[]{1, 1}));
        Assertions.assertEquals(16, new ContainerWithMostWater().maxArea(new int[]{4, 3, 2, 1, 4}));
        Assertions.assertEquals(2, new ContainerWithMostWater().maxArea(new int[]{1, 2, 1}));
    }

    public int calculate(int left, int right, int distance, int currentMax) {
        int max = Math.min(left, right) * distance;
        return Math.max(max, currentMax);
    }

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int currentMax = Math.min(height[j], height[i]) * Math.abs(i - j);

        while (i != j) {
            if (height[i] < height[j]) {
                // move i
                currentMax = calculate(height[++i], height[j], j - i, currentMax);
            } else {
                // decrement j
                currentMax = calculate(height[i], height[--j], j - i, currentMax);
            }
        }

        return currentMax;
    }
}
