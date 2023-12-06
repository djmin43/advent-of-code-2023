package org.example.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputUtil {

    public static ArrayList<String> readInput(int day) {
        File day1Input = new File("../resources/day" + day + "-input.txt");
        ArrayList<String> inputList = new ArrayList<>();
        try {
            Scanner reader = new Scanner(day1Input);
            while (reader.hasNextLine()) {
                inputList.add(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return inputList;
    }
}
