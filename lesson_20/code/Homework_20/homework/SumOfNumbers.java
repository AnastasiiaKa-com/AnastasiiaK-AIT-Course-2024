package Homework_20.homework;
//Напишите программу, которая запрашивает у пользователя строку, содержащую целые числа, и выводит сумму всех этих введенных чисел. Используйте классы-обёртки для преобразования строк в соответствующие примитивы.

import java.util.Scanner;

public class SumOfNumbers {


    public static void main(String[] args) {
//создаем обьект сканер для считывания ввода
        Scanner scanner = new Scanner(System.in);
//запрашиваем у пользователя строку
        System.out.println(" Input a String with integers separated by spaces:");
        java.lang.String input = scanner.nextLine();


        //Разбиваем строку на отдельные подстроки по пробелам, для этого используем сплит.
        //Каждая подстрока предпологается как отдельное число
        java.lang.String[] numberStrings = input.split(" ");

        //переменная для хранения суммы
        int sum = 0;

        //проходим по каждому эл массива строк
        for (java.lang.String numberString : numberStrings){
            try {
                //преобразуем строку в целое число с исп класса обертки Integer
                int number = Integer.parseInt(numberString);
                //добавляем число к сумме
                sum += number;
            }catch (NumberFormatException e){ //(catch используется для обработки исключений которые могут возникнуть в блоке тру, когда код в блоке тру выбрасывает исключение выполнение программы переходиn в соответсвующий блок "сatch" где можно определить как следует реагировать на это исключение
                //если возникла ошибка преобразования выводим сообщение об ошибке
                System.out.println( " Error: '" + numberString + "' Is noz an integer and will be ignored ");
            }
        }//выводим результат
        System.out.println( "Summ of all numbers: " + sum);

    }

}

