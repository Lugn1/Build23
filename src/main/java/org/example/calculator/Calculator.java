package org.example.calculator;

public class Calculator {

    public static int test(int i, int i1) {

        return i + i1;

    }

    public static int commonCount(int[] array1, int[] array2) {
        if (array1.length == 0 || array2.length == 0)
            return 0;

        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i])
                count++;
        }
        return count;
    }
}
