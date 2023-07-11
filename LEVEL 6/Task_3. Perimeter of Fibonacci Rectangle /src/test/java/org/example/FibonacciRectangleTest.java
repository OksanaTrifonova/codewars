package org.example;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class FibonacciRectangleTest {

    @Test
    public void test() {
        executeTest(2, 10);
      //  executeTest(3, 16);
        executeTest(5, 42);
    }

    private static void executeTest(int n, int expectedPerimeter) {
        assertEquals(BigInteger.valueOf(expectedPerimeter), FibonacciRectangle.perimeter(BigInteger.valueOf(n)));
    }
}