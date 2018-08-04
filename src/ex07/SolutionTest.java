package ex07;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void testSomething1() {
        assertEquals(144, FindSquare.findNextSquare(121));
    }
    public void testSomething2() {
        assertEquals(-1, FindSquare.findNextSquare(11));
    }
    public void testSomething3() {
        assertEquals(-1, FindSquare.findNextSquare(0));
    }
    public void testSomething4() {
        assertEquals(9, FindSquare.findNextSquare(4));
    }
}