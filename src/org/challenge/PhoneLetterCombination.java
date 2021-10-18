package org.challenge;

import org.junit.jupiter.api.Assertions;

import java.util.*;

public class PhoneLetterCombination {

    private static Map<Character, String> dictionary = new TreeMap<>();
    {
        dictionary.put('2', "abc");
        dictionary.put('3', "def");
        dictionary.put('4', "ghi");
        dictionary.put('5', "jkl");
        dictionary.put('6', "mno");
        dictionary.put('7', "pqrs");
        dictionary.put('8', "tuv");
        dictionary.put('9', "wxyz");
    }

    private List<String> letterCombinations(String substring, String digits, int ind) {
        if (substring.length() == digits.length()) {
            return List.of(substring);
        }

        List<String> result = new ArrayList<>();
        String row = dictionary.get(digits.charAt(ind));
        for (int i = 0; i < row.length(); ++i) {
            result.addAll(letterCombinations(substring + row.charAt(i), digits, ind + 1));
        }

        return result;
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        return letterCombinations("", digits, 0);
    }

    public static void main(String[] args) {
        Assertions.assertEquals(27, new PhoneLetterCombination().letterCombinations("234").size());
    }
}
