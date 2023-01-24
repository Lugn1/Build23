package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void addZeroWithZeroShouldReturnZero(){
        int result = Calculator.test(0,0);

        assertEquals(0,result);
    }
}
