package com.company;

import java.util.Scanner;

public class J21_Loops_isPalindrome {
    protected static String str;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word to check if it is palindrome");

        str = input.nextLine();

        String reversedInput = wordReverser(str);
        boolean isPal = isPalindrome(reversedInput);
        System.out.println(isPal);
    }

    private static boolean isPalindrome(String reversedInput) {
        boolean isPalindrome;
        if (reversedInput.equalsIgnoreCase(str)){
            isPalindrome = true;
        }else
            isPalindrome = false;

        return isPalindrome;
    }

    private static String wordReverser(String str) {
        byte [] strAsByteArray = str.getBytes();
        byte [] reversedByteArray = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++){
            reversedByteArray[i]= strAsByteArray[(strAsByteArray.length -1) -i ];

        }
        String reversedWord = new String(reversedByteArray);
        return reversedWord;
    }
}