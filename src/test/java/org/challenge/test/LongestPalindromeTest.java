package org.challenge.test;

import org.challenge.LongestPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromeTest {

    @Test
    public void test() {
        Assertions.assertEquals("bab", new LongestPalindrome().longestPalindrome("babad"));
        Assertions.assertEquals("bb", new LongestPalindrome().longestPalindrome("cbbd"));
        Assertions.assertEquals("a", new LongestPalindrome().longestPalindrome("a"));
        Assertions.assertEquals("a", new LongestPalindrome().longestPalindrome("ac"));
    }
}
