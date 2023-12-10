package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1013Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numPairsDivisibleBy60");
        SolutionA1013 instance = new SolutionA1013();

        assertEquals(3, instance.numPairsDivisibleBy60(new int[] {30,20,150,100,40}));
        assertEquals(3, instance.numPairsDivisibleBy60(new int[] {60,60,60}));

    }
}
