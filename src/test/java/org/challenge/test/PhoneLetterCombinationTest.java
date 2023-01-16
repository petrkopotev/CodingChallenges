package org.challenge.test;

import org.challenge.PhoneLetterCombination;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneLetterCombinationTest {

    @Test
    public void test() {
        Assertions.assertEquals(27, new PhoneLetterCombination().letterCombinations("234").size());
    }
}
