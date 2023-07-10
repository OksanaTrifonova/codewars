package org.example;

public class Palindromes {
    public static int longestPalindrome(final String s) {
        int maxLength = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = s.substring(i, j);
                if (isPalindrome(substring)) {
                    maxLength = Math.max(maxLength, substring.length());
                }
            }
        }

        return maxLength;
    }

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}