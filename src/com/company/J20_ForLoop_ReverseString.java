package com.company;

import java.util.Scanner;

public class J20_ForLoop_ReverseString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to be reversed");
        String word = input.nextLine();

        String reversedWord = wordReverser(word);
        System.out.println(reversedWord);
    }

    private static String wordReverser(String word) {
        String reversedWord = "";
        if (word != null) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord = reversedWord + word.charAt(i);

            }
        }else {
            return word;
        }
        return reversedWord;
    }
}
