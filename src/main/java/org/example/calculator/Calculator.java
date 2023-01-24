package org.example.calculator;

public class Calculator {

    public static int test(int i, int i1) {
        return i + i1;
    }

    public static int commonCount(int[] array1, int[] array2) {
        if (array1 == null || array2 == null)
            return 0;
        int count = 0;
        for (int j : array1)
            for (int k : array2)
                if (j == k)
                    count++;

        return count;
    }
}
