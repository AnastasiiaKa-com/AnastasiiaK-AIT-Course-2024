package Classwork_12;

//Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
//Запросите у пользователя какое-то натуральное число.
//Определите, есть ли это число в массиве.
//Создайте и используйте метод searchInArray, который получает на вход массив и искомое число, а возвращает
//ответ - нашлось ли это число в массиве.

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int[] number = new int[10];
        // fill in array number
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(100) + 1;
        }

        // print array scaner


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int n = scanner.nextInt();

        boolean isInArray = searchInArray(number, n);
        System.out.println(" Number " + n + " is in array: " + isInArray );

    }

    private static boolean searchInArray(int[] number, int n) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == n) {
                return true;
            }
        }
        return false;

    }
    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[ i ] + "");

        }
        System.out.println();
        System.out.println("--------------------------------");
    }
}




