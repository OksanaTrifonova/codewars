package org.example;

import org.junit.Test;


import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void firstTest() {
        Solution sol = new Solution();
        String[] words = new String[] {"nigeb", "ta", "eht", "gninnigeb"};
        assertEquals(Arrays.toString(new String[] {"ta", "nigeb", "gninnigeb", "eht"}),Arrays.toString(sol.unusualLexOrder(words)));
        words = new String[] {"a", "b", "a", "d", "c"};
        assertEquals(Arrays.toString(new String[] {"a", "a", "b", "c", "d"}),Arrays.toString(sol.unusualLexOrder(words)));

    }
}