package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution913Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("catMouseGame");
        Solution913 instance = new Solution913();

        assertEquals(0, instance.catMouseGame(new int[][]{{2,5},{3},{0,4,5},{1,4,5},{2,3},{0,2,3}}));
    }
}
