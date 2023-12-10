package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution985Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sumEvenAfterQueries");
        Solution985 instance = new Solution985();

        assertArrayEquals(new int[] {8,6,2,4}, instance.sumEvenAfterQueries(new int[] {1,2,3,4}, new int[][]{{1,0},{-3,1},{-4,0},{2,3}}));
    }
}
