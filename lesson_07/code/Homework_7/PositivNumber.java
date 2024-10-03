package Homework_7;

// Вводится положительное целое число, найдите сумму его цифр. Пример: 1725,
// сумма цифр = 15

import java.util.Scanner;

public class PositivNumber {



    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Input positive number:");
        int number =scanner.nextInt();
        int num1 = 5555;
        int num2 = 0;
        while (num1 > 0){

            num2 = num2 + num1 %10;
            num1 = num1 /10;
            System.out.println(number);



        }



        System.out.println("Digits in number "  + num1  + " are = "  + num2);





    }// end of class



}// end of class
