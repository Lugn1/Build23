package org.example.roman;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {

    RomanNumeral romanNumeral = new RomanNumeral();

    @DisplayName("Convert from Roman Numeral to Decimal number system")
    @ParameterizedTest(name = "{index} ==> roman ''{0}'' is {1}")
    @CsvSource({
            "I, 1",
            "IV, 4",
            "V, 5"
    })
    void convertFromRomanToDecimal(String romanNumber, int expected) {
        var result = romanNumeral.convert(romanNumber);
        assertEquals(expected,result);
    }

}