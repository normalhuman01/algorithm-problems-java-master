package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import johnny.algorithm.common.Point;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class Solution587Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("outerTrees");
        Solution587 instance = new Solution587();

        Point[] points1 = Point.buildArray(new int[][] {{1,1},{2,2},{2,0},{2,4},{3,3},{4,2}});
        List<Point> expResult1 = Point.buildList(new int[][]{{1,1},{2,0},{4,2},{3,3},{2,4}});
        assertTrue(ListUtil.equalsIgnoreOrder(expResult1, instance.outerTrees(points1)));

        Point[] points2 = Point.buildArray(new int[][] {{1,2},{2,2},{4,2}});
        List<Point> expResult2 = Point.buildList(new int[][]{{1,2},{2,2},{4,2}});
        assertTrue(ListUtil.equalsIgnoreOrder(expResult2, instance.outerTrees(points2)));
    }
}
