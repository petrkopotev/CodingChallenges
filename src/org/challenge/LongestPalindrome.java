package org.challenge;

import org.junit.jupiter.api.Assertions;

public class LongestPalindrome {

    public static void main(String[] s) {
        Assertions.assertEquals("bab", new LongestPalindrome().longestPalindrome("babad"));
        Assertions.assertEquals("bb", new LongestPalindrome().longestPalindrome("cbbd"));
        Assertions.assertEquals("a", new LongestPalindrome().longestPalindrome("a"));
        Assertions.assertEquals("a", new LongestPalindrome().longestPalindrome("ac"));
    }

    public String longestPalindrome(String s) {
        if (s.isEmpty()) return "";
        String totalPalindrome = String.valueOf(s.charAt(0));

        for (int i = 0; i < s.length() - 1; ++i) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                String palindrome = s.substring(i, i + 2);
                // lets check if palindrom is bigger than this simple one
                int j = 1;
                while (i - j >= 0 && i + 1 + j < s.length()) {
                    if (s.charAt(i - j) == s.charAt(i + j + 1)) {
                        //grow palindrome
                        palindrome = s.substring(i - j, i + j + 2);
                    } else {
                        break;
                    }

                    ++j;
                }

                if (totalPalindrome.length() < palindrome.length()) {
                    totalPalindrome = palindrome;
                }
            }

            if (i + 2 < s.length() && s.charAt(i) == s.charAt(i + 2)) {
                String palindrome = s.substring(i, i + 3);
                int j = 1;
                while (i - j >= 0 && i + j + 2 < s.length()) {
                    if (s.charAt(i - j) == s.charAt(i + j + 2)) {
                        //grow palindrome
                        palindrome = s.substring(i - j, i + j + 3);

                    } else {
                        break;
                    }

                    ++j;
                }

                if (totalPalindrome.length() < palindrome.length()) {
                    totalPalindrome = palindrome;
                }
            }
        }

        return totalPalindrome;
    }

}
