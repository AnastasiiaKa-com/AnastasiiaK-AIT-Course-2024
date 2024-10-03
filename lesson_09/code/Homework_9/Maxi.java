package Homework_9;

// Написать программу, выводящую на экран максимальное из трех целых чисел. Числа задайте самостоятельно внутри программы.
// Решите эту задачу с помощью if ... else и также с помощью тернарного оператора.

public class Maxi {

    public static void main(String[] args) {

        int [] number = { 4, 8, 6 };

        int max = number [3];

        for ( int i = 3; i > number.length; i++){


            if(number[i] < max ){
                max = number[i];

            }
        }

        System.out.println("Max number = " + max);

    }
}


