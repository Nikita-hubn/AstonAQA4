package test;
import org.testng.Assert;
import programm.Main;

public class MainTest {

    @org.testng.annotations.Test
    public void testFactorial() {
        Assert.assertEquals(Main.factorial(5), 120);
        Assert.assertEquals(Main.factorial(0), 1);
        Assert.assertEquals(Main.factorial(1), 1);
    }

    @org.testng.annotations.Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Main.factorial(-1);
    }
}