package com.company;

import java.util.Scanner;
public class J20_ForLoop_NumberByNumber {

    public static void main (String [] args){

        //loop from the smalles number to the largest number
        Scanner scanner = new Scanner(System.in);
        int firstNum, secondNum;

        System.out.println("Enter your first number");
        firstNum = scanner.nextInt();
        System.out.println("Enter your second number");
        secondNum = scanner.nextInt();

        if (firstNum >= 0 && firstNum < secondNum){
            for (int i = firstNum; i<secondNum+1; i++){
                System.out.println("Step " + i);
            }
        }else if(secondNum >= 0 && secondNum < firstNum){
            for (int i = secondNum; i<firstNum+1; i++){
                System.out.println("Step " + i);
            }
        }else {
            System.out.println("Step " + firstNum + "and step " + secondNum + " are even.");
        }


    }
}
