package Homework_11;

//Задан массив целых чисел: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83. Найдите максимальный элемент массива и его индекс.
// Поставьте этот элемент в начало массива вместо имеющегося.

import java.sql.SQLOutput;

public class MaxEl {
    public static void main(String[] args) {

        int [] array = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83};

        int maxOfArray = array [0] ;
        int indexOfMaxElement = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxOfArray) {

                maxOfArray = array[i];
                indexOfMaxElement = i;
            }
        }
        System.out.println(" Max element of array = " + maxOfArray + " ," + "index of max Element = " + indexOfMaxElement);
        array[0] = array [indexOfMaxElement];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }//end of main

}//end of class
