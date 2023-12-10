package johnny.hackerrank.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.hackerrank.algorithm.MakeitAnagram;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class MakeitAnagramTest {
    
    public MakeitAnagramTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of makeAnagram method, of class MakeitAnagram.
     */
    @Test
    public void testMakeAnagram() {
        System.out.println("makeAnagram");
        String a = "";
        String b = "";
        MakeitAnagram instance = new MakeitAnagram();
        int expResult = 0;
        int result = instance.makeAnagram(a, b);
        assertEquals(expResult, result);
        
        assertEquals(4, instance.makeAnagram("cde", "abc"));
        assertEquals(2, instance.makeAnagram("ab", "bc"));
    }
}
