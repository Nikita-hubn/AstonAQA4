package test;

import org.junit.jupiter.api.Test;
import programm.Main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, Main.factorial(0));
    }
    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, Main.factorial(5));
    }
    @Test
    public void testFactorialOfOne() {
        assertEquals(1, Main.factorial(1));
    }
    @Test
    public void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Main.factorial(-1);
        });
        assertEquals("Факториал отрицательного числа не может быть", exception.getMessage());
    }
}