package com.tuancd.algorithm;

public class ArrayUtils {
    public static int findMax(int[] array, int n) {
        if (n == 1) {
            return array[0];
        }
        return Math.max(array[n - 1], findMax(array, n - 1));
    }

    public static int findMin(int[] array, int n) {
        if (n == 1) {
            return array[0];
        }
        return Math.min(array[n - 1], findMin(array, n - 1));
    }
}
