package org.example.day1;

import org.example.utils.InputUtil;

import java.util.ArrayList;

public class Day1 {

    public static void main(String[] args) {
        ArrayList<String> inputList = InputUtil.readInput(1);
        int partOneAnswer = partOne(inputList);
        System.out.println("partOneAnswer = " + partOneAnswer);
        int partTwoAnswer = partTwo(inputList);
        System.out.println("partTwoAnswer = " + partTwoAnswer);

    }

    protected static int partTwo(ArrayList<String> inputList) {
        int sum = 0;
        ArrayList<String> numberList = getNumberList();
        for (int i = 0; i < inputList.size(); i++) {
            String code = inputList.get(i);
            for (int j = 0; j < numberList.size(); j++) {
                String leadingString = Character.toString(numberList.get(j).charAt(0));
                String endingString = Character.toString(numberList.get(j).charAt(numberList.get(j).length() - 1));
                code = code.replaceAll(numberList.get(j), leadingString +Integer.toString(j + 1) + endingString);
            }
            int total = getCodeTotal(code);
            sum += total;
        }
        return sum;
    }

    protected static int partOne(ArrayList<String> inputList) {
        int sum = 0;
        for (int i = 0; i < inputList.size(); i++) {
            String code = inputList.get(i);
            int total = getCodeTotal(code);
            sum += total;
        }
        return sum;
    }

    protected static int getCodeTotal(String code) {
        ArrayList<Character> charList = new ArrayList<>();
        for (int j = 0; j < code.length(); j++) {
            if (Character.isDigit(code.charAt(j)))
                charList.add(code.charAt(j));
        }
        String total = String.valueOf(charList.get(0)) + String.valueOf(charList.get(charList.size() - 1));
        return  Integer.parseInt(total);
    }

    private static ArrayList<String> getNumberList() {
        ArrayList<String> numberList = new ArrayList<>();
        numberList.add("one");
        numberList.add("two");
        numberList.add("three");
        numberList.add("four");
        numberList.add("five");
        numberList.add("six");
        numberList.add("seven");
        numberList.add("eight");
        numberList.add("nine");
        return numberList;
    }

}
