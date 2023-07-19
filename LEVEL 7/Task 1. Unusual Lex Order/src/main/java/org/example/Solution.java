package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static String[] unusualLexOrder(String[] words) {
        Arrays.sort(words, Comparator.comparing((String a) -> new StringBuilder(a).reverse().toString()));
        return words;
    }
}