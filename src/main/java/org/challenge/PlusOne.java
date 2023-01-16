package org.challenge;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; --i) {
            digits[i]++;
            if(digits[i] == 10) {
                digits[i] = 0;
                if( i == 0 ) {
                    // last iteration
                    int[] result = Arrays.copyOf(new int[]{1}, 1 + digits.length);
                    System.arraycopy(digits, 0, result, 1, digits.length);
                    return result;
                }
            } else {
                break;
            }
        }

        return digits;
    }
}


