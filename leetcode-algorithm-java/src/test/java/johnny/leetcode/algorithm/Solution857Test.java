package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution857Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("mincostToHireWorkers");
        Solution857 instance = new Solution857();

        assertEquals(105.00000, instance.mincostToHireWorkers(new int[] {10,20,5}, new int[] {70,50,30}, 2), 5);
    }
}
