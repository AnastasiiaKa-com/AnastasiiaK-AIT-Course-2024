package Classwork_8;

//Задача 1.
//Пользователь вводит с клавиатуры строку.
//Распечатайте каждую букву строки на новой строчке.
//Используйте методы length и charAt() класса String.


import java.util.Scanner;

public class LettersInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String str=scanner.nextLine();

        System.out.println(str);

        int l = str.length();

        System.out.println(l);
        int i = 0;


        //Anastasiia
        //01345678910

        while(i < l){

            System.out.println(str.charAt(i));
            i++;//или i = i +1 ; или i += 1


        }


    }
}

