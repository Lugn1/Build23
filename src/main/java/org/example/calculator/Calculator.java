package org.example.calculator;

import java.time.LocalTime;
import java.util.Random;

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

    public static String greeting(String name, LocalTime currentTime) {
        if (currentTime.isAfter(LocalTime.NOON))
            return "Good afternoon " + name;
        return "Good morning " + name;
    }


    public static class Die {

        private Random random;

        public Die(){
            random = new Random();
        }

        public Die(Random random){
            this.random = random;
        }
        public int roll() {
            random.nextInt();
            return random.nextInt(1,7);

        }
    }
}

