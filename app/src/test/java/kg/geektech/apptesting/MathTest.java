package kg.geektech.apptesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest{

    private Model math;

    @Before
    public void setUp() {
        math = new Model();

    }

    @Test
    public void testAdd() {
        assertEquals(4, math.add(1, 3));

    }

    @Test
    public void multiply() {
        assertEquals(10, math.multiply(5, 2));

    }

    @Test
    public void div() {
        assertEquals(20, math.div(40, 2));
        assertEquals(0, math.div(40, 0));
    }

    @Test
    public void subtraction() {
        assertEquals(15, math.subtract(20, 5));
    }

    @Test
    public void revert() {
    }

    @After
    public void tearDown() {
        math = null;
    }

}
