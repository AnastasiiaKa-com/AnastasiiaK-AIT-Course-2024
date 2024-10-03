package Homework_6;

//Пользователь с клавиатуры вводит число от 1 до 12,программа сообщает, какому времени года принадлежит введенный месяц.

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of months:");

        int seasons = scanner.nextInt();

        switch (seasons) {
            case 1 -> {
                System.out.println("This is January.");
            }
            case 2 -> {
                System.out.println("This is February.");
            }
            case 3 -> {
                System.out.println("This is March.");
            }
            case 4 -> {
                System.out.println("This is April.");
            }
            case 5 -> {
                System.out.println("This is May.")
                ;
            }
            case 6 -> {
                System.out.println("This is Juni.");
            }
            case 7 -> {
                System.out.println("This is Juli.");
            }
            case 8 -> {
                System.out.println("This is August.");
            }
            case 9 -> {
                System.out.println("This is Semptember.");
            }
            case 10 -> {
                System.out.println("This is October.");
            }
            case 11 -> {
                System.out.println("This is Nowember.");
            }
            case 12 -> {
                System.out.println("This is December.");
            }
            default -> {
                System.out.println("Wrong input!");
            }
        }

        switch (seasons) {
            case 1, 2, 12 -> {
                System.out.println("This is Winter!");

            }
            case 3, 4, 5 -> {

                System.out.println("This is Spring!");
            }
            case 6, 7, 8 -> {

                System.out.println("This is Summer!");

            }
            case 9, 10, 11 -> {

                System.out.println("This is Autumn!");
            }

        }
    }

}