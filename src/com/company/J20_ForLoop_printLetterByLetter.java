package com.company;

import java.util.Scanner;

public class J20_ForLoop_printLetterByLetter {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();

        char cha;
        for (int i = 0; i<=word.length()-1; i++){
            cha = word.charAt(i);
            System.out.println(cha);
        }

    }
}
