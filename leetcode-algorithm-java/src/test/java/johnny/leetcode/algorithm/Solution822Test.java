package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution822Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("flipgame");
        Solution822 instance = new Solution822();

        assertEquals(2, instance.flipgame(new int[] {1,2,4,4,7}, new int[] {1,3,4,1,3}));
    }
}
