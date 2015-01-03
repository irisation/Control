package com.busel;

import java.util.*;

public class Words {
    int count;
    String[] words;
    public static boolean hasUniqueSigns(String word) {
        HashSet<Character> uniqueSigns = new HashSet<Character>();
        for (Character ch : word.toCharArray()) {
            if (!uniqueSigns.add(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void findWord(String[] sourceWords) {
        for (String word : sourceWords) {
            if (hasUniqueSigns(word)) {
                System.out.println("The word with different signs is  "
                        + word);
                break;
            }
        }
    }
    Words(Scanner inScan) {
        boolean answer = false;
        while (!answer) {
            System.out.println("Enter a number of words ");
            try {
                count = inScan.nextInt();
                answer = true;
            } catch (InputMismatchException ex) {
                System.out.println("Input should be a number");
            } catch (Exception ex) {
                System.out.println("Sorry critical error happend");
            }
        }

        String[] words = new String[count];
        System.out.println("Enter " + count + " words:");
        for (int i = 0; i < count; i++) {
            words[i] = inScan.next();
        }
        findWord(words);

    }
}
