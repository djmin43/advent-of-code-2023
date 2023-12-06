package org.example.day1;

import org.example.utils.InputUtil;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Day1Test {

    @Test
    @DisplayName("test part One")
    public void testPartOne() {
        ArrayList<String> inputList = InputUtil.readInput(1);
        Day1 day1 = new Day1();
        int answer = day1.partOne(inputList);
        int expected = 54632;
        assertEquals(answer, expected);
    }
}