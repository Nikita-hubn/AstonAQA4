package test;

import programm.Main;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MainTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(Main.factorial(0), 1);
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(Main.factorial(1), 1);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(Main.factorial(10), 3628800);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        Main.factorial(-54);
    }
}