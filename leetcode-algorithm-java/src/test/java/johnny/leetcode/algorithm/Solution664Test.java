package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution664Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("strangePrinter");
        Solution664 instance = new Solution664();

        assertEquals(2, instance.strangePrinter("aaabbb"));
        assertEquals(2, instance.strangePrinter("aba"));
    }
}
