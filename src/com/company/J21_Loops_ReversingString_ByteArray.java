package com.company;

public class J21_Loops_ReversingString_ByteArray {
    public static void main(String[] args) {

        String word = "hello";
        System.out.println(wordReverser(word));
    }

    private static String wordReverser(String word) {

        byte [] wordAsByteArray = word.getBytes();
        byte [] reversedByteArray = new byte[wordAsByteArray.length];

        for (int i = 0; i<wordAsByteArray.length; i++)
            reversedByteArray[i] = wordAsByteArray[(wordAsByteArray.length -1) -i];

        String reversedWord = new String(reversedByteArray);
        return reversedWord;
    }
}
