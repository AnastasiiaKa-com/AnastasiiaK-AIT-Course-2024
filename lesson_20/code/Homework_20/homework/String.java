package Homework_20.homework;
// Разработайте приложение, которое принимает от пользователя строку (некое предложение, например: "Мама мыла раму.") и выводит:
//количество символов в строке;
//количество символов в верхнем регистре;
//количество цифр в строке;
//количество пробелов в строке (код пробела = 32);
//в зависимости от последнего символа в строке сообщает, какое это предложение:
//повествовательное;
//вопросительное;
//восклицательное. Используйте методы класса Character.

import java.util.Scanner;

public class String {

    public static void main(String[] args) {
        //Cоздаем обьект сканер для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);
        //Запрашиваем у пользователя ввод строки
        System.out.println(" Input a suggestion: ");
        java.lang.String input = scanner.nextLine();

        //переменные для хранения различных подсчетов
        int totalCharacters = 0;//общее количество символов
        int uppercaseCount = 0;//кол.во символов в верхнем регистре
        int digitCount = 0;//количество цифр в строке;
        int spaceCount = 0;//количество пробелов в строке (код пробела = 32);

        //проходим по каждому символу в строке

        for (char ch : input.toCharArray()) {
            totalCharacters++; //увеличиваем общее количество символов
            //Проверяем является ли символ заглавной буквой
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;//Увеличиваем счетчик заглавных букв
            }
            //Проверяем является ли символ цифрой
            if (Character.isDigit(ch)) {
                digitCount++;//Увеличиваем счетчик цифр
            }
            //Проверяем является ли символ прбелом
            if (ch == ' ') {
                spaceCount++;//Увеличиваем счетчик пробелов

            }
            //Выводим результаты подсчетов
            System.out.println(" Number of characters per line:" + totalCharacters);
            System.out.println(" Number of characters in uppercase:" + uppercaseCount);
            System.out.println(" Number of digits in a line:" + digitCount);
            System.out.println(" Number of spaces in a line:" + spaceCount);

            //Определяем тип предложения по последнему символу
            char lastChar = input.charAt(input.length() - 1);//Получаем почследний символ
            if (lastChar == '.') {
                System.out.println(" This is a narrative sentence.");
            } else if (lastChar == '?') {
                System.out.println("This is a question sentence.");
            } else if (lastChar == '!') {
                System.out.println("This is a exclamation sentence.");
            } else {
                System.out.println(" The type of offers is not defined.");
            }

        }


    }
}
