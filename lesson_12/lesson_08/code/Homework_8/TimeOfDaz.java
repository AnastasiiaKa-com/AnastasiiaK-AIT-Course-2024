package Homework_8;

import java.util.Scanner;

public class TimeOfDaz {//Определение времени суток. Напишите программу, которая принимает на вход текущий час (от 0 до 23)
    // и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).



        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Inut time.What time of daz is it?");

            int time = scanner.nextInt();

            switch (time) {

                case 5,6,7,8,9,10 ->System.out.println("This is Morning!Good morning");

                case 11,12,13,14,15,16,17 ->System.out.println("It's a day!Good aternoon");

                case 18,19,20,21,22 ->System.out.println("It's evening!evening");

                case 23,24,00,1,2,3,4 ->System.out.println("It's night!Good night");
            }





        }//end of main





    }//end of class

