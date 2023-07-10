package org.example;

public class FindOutlier {
    static int find(int[] integers) {
        boolean isOddArray = isOddArray(integers);
        for (int i = 0; i < integers.length; i++) {
            if (isOddArray) {
                if (integers[i] % 2 != 0) {
                    return integers[i];
                }
            } else {
                if (integers[i] % 2 == 0) {
                    return integers[i];
                }
            }
        }
        return 0;
    }

    private static boolean isOddArray(int[] integers) {
        int count = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                count++;
            }
        }
        if (count > 1) {
            return true;
        } else return false;
    }
}