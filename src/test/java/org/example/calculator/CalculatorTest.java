package org.example.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalTime;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CalculatorTest {

    @Test
    void addZeroWithZeroShouldReturnZero(){
        int result = Calculator.test(0,0);

        assertEquals(0,result);
    }

    @Test
    void addOneWithOneShouldReturnTwo() {
        int result = Calculator.test(1,1);

        assertEquals(2,result);
    }

    @Nested
    @DisplayName("Count common Numbers")
    class Count {

        @Test
        void addOneWithTwoShouldReturnThree() {
            assertEquals(3, Calculator.test(1, 2));
        }

        @Test
        void twoEmptyArraysHasZeroCommonNumbers() {
            var array1 = new int[0];
            var array2 = new int[0];

            assertEquals(0, Calculator.commonCount(array1, array2));
        }

        @Test
        void twoArraysWithSameNumberHasOneCommonNumber() {
            var array1 = new int[]{2};
            var array2 = new int[]{2};

            assertEquals(1, Calculator.commonCount(array1, array2));
        }

        @Test
        void twoArraysWithSameNumbersHasTwoCommonNumbers() {
            var array1 = new int[]{2, 3};
            var array2 = new int[]{2, 3};

            assertEquals(2, Calculator.commonCount(array1, array2));
        }

        @Test
        void twoArraysWithDifferentLengthHasTwoCommonNumbers() {
            var array1 = new int[]{1, 2, 3};
            var array2 = new int[]{2, 3};

            assertEquals(2, Calculator.commonCount(array1, array2));
        }

        @Test
        void twoArraysWithUnorderedNumbersLengthHasTwoCommonNumbers() {
            var array1 = new int[]{3, 1, 2, -2};
            var array2 = new int[]{2, 3, -2};

            assertEquals(3, Calculator.commonCount(array1, array2));
        }

        @Test
        void usingNullAsArgumentShouldReturnZeroCommonNumbers() {
            assertEquals(0, Calculator.commonCount(null, null));
        }

    }

    @Nested
    @DisplayName("Greeting")
    class Greeting{
        @Test
        @DisplayName("when time < 12, greet with Good morning")
        void whenTimeOfDayIsBefore12GreetWithGoodMorning () {
            assertEquals("Good morning Martin" ,
                    Calculator.greeting("Martin", LocalTime.of(7,20)));
        }

        @Test
        @DisplayName("when time > 12, greet with Good afternoon")
        void whenTimeOfDayIsAfter12GreetWithGoodAfternoon () {
            assertEquals("Good afternoon Kalle" ,
                    Calculator.greeting("Kalle", LocalTime.of(12, 1)));

        }
    }

    @Nested
    class UnpredictableDice {

        @Test
        void canReturnOne(){
            var random = Mockito.mock(Random.class);
            when(random.nextInt(1,7)).thenReturn(1);

            //Calculator.Die die = new Calculator.Die(new Random(12));

            Calculator.Die die = new Calculator.Die(random);
            assertEquals(1, die.roll());

        }
    }


}
