package ex13;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void test1() {
        assertEquals("[[1, 1], [42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(1, 250));
    }
    @Test
    public void test2() {
        assertEquals("[[42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(42, 250));
    }
    @Test
    public void test3() {
        assertEquals("[[287, 84100]]", SumSquaredDivisors.listSquared(250, 500));
    }
}