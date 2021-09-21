package org.challenge;

import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoSum {

    public static void main(String[] s) {
        Assertions.assertArrayEquals(new int[]{0, 1}, new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9));
        Assertions.assertArrayEquals(new int[]{1, 2}, new TwoSum().twoSum(new int[]{3,2,4}, 6));
        Assertions.assertArrayEquals(new int[]{0, 1}, new TwoSum().twoSum(new int[]{3, 3}, 6));
    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, List<Integer>> m = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (!m.containsKey(nums[i]))
                m.put(nums[i], Stream.of(i).collect(Collectors.toList()));
            else {
                m.get(nums[i]).add(i);
            }

        }

        for (Integer i : m.keySet()) {
            if (m.containsKey(target - i)) {
                for (int j = 0; j < m.get(target - i).size(); ++j) {
                    if (!m.get(i).get(0).equals(m.get(target - i).get(j))) {
                        return new int[]{m.get(i).get(0), m.get(target - i).get(j)};
                    }
                }

            }
        }
        return new int[2];
    }
}
