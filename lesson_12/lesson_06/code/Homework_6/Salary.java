package Homework_6;

//Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$.
// За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%, за 10 лет работы надбавка 100%,
// за 15 лет работы надбавка 150%.
// Сколько лет проработал работник вводится с клавиатуры.

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculacion of salary based on experience:");

        int basicSalary = 500;
        int experience = 5;


        int salaryBasedOnExperience = scanner.nextInt();

        switch ( salaryBasedOnExperience) {

            case '1' -> {
                System.out.println("For three years of work,the allowance is  + 10%.");
            }

            case '2' -> {

                System.out.println("For five years of work,the allowance is  + 50%.");
            }

            case '3' -> {
                System.out.println("For ten years of work,the allowance is + 100%.");

            }

            case '4' -> {
                System.out.println("For fifteen years of work,the allowance is + 150%.");

            }
        }

    } // end of main

} // end of class
