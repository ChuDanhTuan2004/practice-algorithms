package com.tuancd.algorithm;

public class DigitCount {
    public static int countDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return 1 + countDigits(number / 10);
    }
}
