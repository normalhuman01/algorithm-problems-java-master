package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class Solution401Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("readBinaryWatch");
        Solution401 instance = new Solution401();

        List<String> expect1 = ListUtil.buildList(new String[] {"1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect1, instance.readBinaryWatch(1)));
    }
}
