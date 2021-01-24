package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {
        //This block takes user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String example = input.nextLine();

// This block takes the standard example
//
//        String example = "If the product of two terms is zero then common sense" +
//                " says at least one of the two terms has to be zero to start with. " +
//                "So if you move all the terms over to one side, you can put the quadratics " +
//                "into a form that can be factored allowing that side " +
//                "of the equation to equal zero. Once you’ve done that, it’s pretty " +
//                "straightforward from there.";

        example = example.toUpperCase();

        char[] charArray = example.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();


        for (char currentChar : charArray) {
            if (currentChar >= 65 && currentChar <= 90) {
                if (charCount.containsKey(currentChar)) {
                    charCount.put(currentChar, charCount.get(currentChar) + 1);
                } else {
                    charCount.put(currentChar, 1);
                }
            }
        }
        for (char key : charCount.keySet()) {
            System.out.println(key + ": " + charCount.get(key));
        }

    }
}

