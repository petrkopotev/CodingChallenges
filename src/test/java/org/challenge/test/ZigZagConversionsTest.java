package org.challenge.test;

import org.challenge.ZigZagConversions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZigZagConversionsTest {

    @Test
    public void test() {
        Assertions.assertEquals("PAHNAPLSIIGYIR", new ZigZagConversions().convert("PAYPALISHIRING", 3));
        Assertions.assertEquals("PINALSIGYAHRPI", new ZigZagConversions().convert("PAYPALISHIRING", 4));
        Assertions.assertEquals("A", new ZigZagConversions().convert("A", 1));
    }
}
