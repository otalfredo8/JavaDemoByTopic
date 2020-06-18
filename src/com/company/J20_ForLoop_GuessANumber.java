package com.company;

import java.util.Scanner;
import java.util.Random;
public class J20_ForLoop_GuessANumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int actualInput;
        Random ran = new Random();
        int expectRan = ran.nextInt(10);

        int chances = 3;
        while (chances != 0){
            System.out.println("From 0 to 10 try to guess a number \n You only have "+ chances +" chances");
            actualInput = input.nextInt();

            if (actualInput != expectRan && actualInput > expectRan) {
                System.out.println("to high try again");
                chances--;
                continue;
            }else if (actualInput != expectRan && actualInput < expectRan){
                System.out.println("to low try again");
                chances--;
                continue;
            }else {
                System.out.println("pass");
                break;
            }
        }
        System.out.println(chances + " chances. Game Over!");
    }
}
