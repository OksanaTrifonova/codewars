package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OutlierTest{
    @Test
    public void sampleTests() {
      assertEquals(3, FindOutlier.find(new int[] {2, 6, 8, -10, 3}));
      assertEquals(206847684, FindOutlier.find(new int[] {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
       assertEquals(0, FindOutlier.find(new int[] {Integer.MAX_VALUE, 0, 1}));
    }
}