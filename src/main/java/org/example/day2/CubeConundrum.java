package org.example.day2;

import org.example.utils.InputUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class CubeConundrum {
    public static void main(String[] args) {
        ArrayList<String> inputList = InputUtil.readInput(2);
        ArrayList<ArrayList<String>> splitList = new ArrayList<>();

        for (String inputString : inputList) {
            String[] substrings = inputString.split("[;:,]");
            splitList.add(new ArrayList<>(Arrays.asList(substrings)));
        }

        System.out.println("splitList = " + splitList.get(0));
    }
}
