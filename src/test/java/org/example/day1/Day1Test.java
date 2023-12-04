package org.example.day1;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

class Day1Test {


    @DisplayName("replace number with string")
    @Test
    void replaceNumberWithString() {
        String seven = "seven";
        String testString = "sevenisthemagicnumber";
        String testNumber = Integer.toString(7);
        String expected = "7isthemagicnumber";
        testString.replace(seven, testNumber);

        testString = testString.replace(seven, testNumber);

        assertEquals(testString, expected);




    }
}