package org.challenge;

public class ZigZagConversions {

    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder builder = new StringBuilder(s.charAt(0));

        for(int i = 0; i < numRows; ++i) {
            int j = 0;
            while(true) {
                int charIndex = 2 * (numRows - 1) * j + i;

                if (i % (numRows - 1) != 0) {
                    int charIndex2 =  2 * (numRows - 1) * j + i - (i % (numRows - 1)) * 2;
                    if (charIndex2 < s.length() && charIndex2 > 0) {
                        builder.append(s.charAt(charIndex2));
                    }
                }

                if(charIndex >= s.length()) {
                    break;
                }

                builder.append(s.charAt(charIndex));

                j++;
            }
        }
        return builder.toString();
    }

}
