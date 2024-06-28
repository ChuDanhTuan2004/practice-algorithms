package com.tuancd.algorithm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);

        // Demo Factorial
        int factorialResult = Factorial.factorial(5);
        System.out.println("Factorial of 5 is: " + factorialResult);

        // Demo Power
        int powerResult = Power.power(2, 3);
        System.out.println("2 to the power of 3 is: " + powerResult);

        // Demo Fibonacci
        int fibonacciResult = Fibonacci.fibonacci(6);
        System.out.println("6th Fibonacci number is: " + fibonacciResult);

        // Demo Find Max
        int[] array = {1, 5, 3, 9, 2};
        int maxResult = ArrayUtils.findMax(array, array.length);
        System.out.println("Maximum value in array is: " + maxResult);

        // Demo Find Min
        int minResult = ArrayUtils.findMin(array, array.length);
        System.out.println("Minimum value in array is: " + minResult);

        // Demo Digit Count
        int digitCountResult = DigitCount.countDigits(12345);
        System.out.println("Number of digits in 12345 is: " + digitCountResult);
    }
}
