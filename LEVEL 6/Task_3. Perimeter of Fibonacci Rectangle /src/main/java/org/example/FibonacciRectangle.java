package org.example;

import java.math.BigInteger;

public class FibonacciRectangle {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger[] fib = new BigInteger[n.intValue() + 1];
        for (int i = 0; i <= n.intValue(); i++) {
            if (i == 0 || i == 1) {
                fib[i] = BigInteger.valueOf(1);
            } else {
                fib[i] = ((fib[i - 1]).add(fib[i - 2]));
            }
        }

        BigInteger sum = BigInteger.valueOf(0);
        for (BigInteger e : fib) {
            sum = sum.add(e);
        }

        return sum.multiply(BigInteger.valueOf(2)).add(BigInteger.valueOf(2));

    }
}
