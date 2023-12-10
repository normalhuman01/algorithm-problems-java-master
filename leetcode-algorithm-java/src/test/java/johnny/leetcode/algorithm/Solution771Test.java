package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution771Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numJewelsInStones");
        Solution771 instance = new Solution771();

        assertEquals(3, instance.numJewelsInStones("aA","aAAbbbb"));
        assertEquals(0, instance.numJewelsInStones("z","ZZ"));
    }
}
