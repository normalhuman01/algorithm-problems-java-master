package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution931Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minFallingPathSum");
        Solution931 instance = new Solution931();

        assertEquals(12, instance.minFallingPathSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}
