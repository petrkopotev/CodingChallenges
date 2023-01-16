package org.challenge;

public class ContainerWithMostWater {

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
