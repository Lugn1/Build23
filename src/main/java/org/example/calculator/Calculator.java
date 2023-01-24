package org.example.calculator;

public class Calculator {

    public static int test(int i, int i1) {

        return i + i1;

    }

    public static int commonCount(int[] array1, int[] array2) {
        if (array1.length == 0 || array2.length == 0)
            return 0;
        if (array1[0] == array2[0])
            return 1;
        return 0;
    }
}
