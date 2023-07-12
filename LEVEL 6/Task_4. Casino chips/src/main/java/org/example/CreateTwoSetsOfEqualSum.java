package org.example;

import java.util.Arrays;

class Solution {
    public static int solve(int[] chips) {
        Arrays.sort(chips);
        int days = 0;
        while (chips[1] > 0) {
            chips[1]--;
            chips[2]--;
            days++;
            Arrays.sort(chips);
        }
        return days;
    }
}