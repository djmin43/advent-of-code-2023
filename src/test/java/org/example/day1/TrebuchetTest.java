package org.example.day1;

import org.example.utils.InputUtil;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TrebuchetTest {

    @Test
    @DisplayName("test part one result")
    public void testPartOne() {
        ArrayList<String> inputList = InputUtil.readInput(1);
        Trebuchet trebuchet = new Trebuchet();
        int answer = trebuchet.partOne(inputList);
        int expected = 54632;
        assertEquals(answer, expected);
    }
}