package org.example.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> inputList = readInput();
        partOne(inputList);
    }

    private static void partTwo(ArrayList<String> inputList) {
        for (int i = 0; i < inputList.size(); i++) {
            String code = inputList.get(i);
            ArrayList<Character> charList = new ArrayList<>();

        }


    }

    private static void partOne(ArrayList<String> inputList) {
        int sum = 0;

        for (int i = 0; i < inputList.size(); i++) {
            String code = inputList.get(i);
            ArrayList<Character> charList = new ArrayList<>();
            for (int j = 0; j < code.length(); j++) {
                if (Character.isDigit(code.charAt(j)))
                    charList.add(code.charAt(j));
            }
            String total = String.valueOf(charList.get(0)) + String.valueOf(charList.get(charList.size() - 1));
            sum += Integer.parseInt(total);
        }

        int partOneAnswer = sum;
        System.out.println("partOneAnswer = " + partOneAnswer);

    }

    private static ArrayList<String> readInput() throws FileNotFoundException {
        File day1Input = new File("./day1-input.txt");
        Scanner reader = new Scanner(day1Input);
        ArrayList<String> inputList = new ArrayList<>();
        while (reader.hasNextLine()) {
            inputList.add(reader.nextLine());
        }
        return inputList;
    }



}
