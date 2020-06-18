package com.company;

import java.util.Random;

public class Extent_RandomPassword {
    public static void main(String[] args) {

        System.out.println(generateRandomString(8));
    }

    private static String generateRandomString(int length) {
        Random random = new Random();
        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        char[] text = new char[length];

        for (int i = 0; i < text.length; i++) {
            text[i] = string.charAt(random.nextInt(string.length() - 1));
        }
        return new String(text);
    }


}