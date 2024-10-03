package Homework_14;//Часть1. Заполните массив целыми числами от 1 до 100.
// Создайте второй массив с размером на 1 больше, чем имеющийся.
// Скопируйте первый массив в новый массив.
//Часть 2. Добавьте случайное целое число в интервале от 1 до 100
// на случайное место в исходный массив.

import java.util.Random;

import static ArrayMethod.ArrayMethods.printArray;

public class Homework14 {
    public static void main(String[] args) {
        // cоздание массива с целыми числами от 1 до 100
        int[]originalArray = new int[100];
        for (int i = 0; i < originalArray.length; i++) {
           //заполнение массива от 1 до 100
           originalArray[i] = i + 1;
        }
        //второй массив размером на 1 больше
        int[]newArray = new int[originalArray.length +1];
        //копировать 1 массив во второй
        System.arraycopy(originalArray, 0,newArray, 0,originalArray.length);
        //сгенерировать случайное число от 1 до 100
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        //добавить случайное число в случайное место в исходном  массиве
        int randomIndex = random.nextInt(originalArray.length);//случайный индекс для исходного массива
        newArray[randomIndex] = randomNumber;//вставляем случайное число в новый массив
       //напечатать оба массива для поверки
        System.out.print(" OriginalArray:");
        printArray(originalArray);
        System.out.print(" A newArray with an added number:");
        printArray(newArray);

        }//метод для печати массива
public static void printArray(int[] array){
        for (int num : array){
            System.out.print(num+ " ");// печатаем каждое число
        }
    System.out.println();
}



    }
    

