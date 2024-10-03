package RandomNumbers;




//**Задача 1.**
//Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
//Выполните сортировку полученного массива.
//Попало ли число 0 в этот массив? (выяснить с помощью binary search)
//Если да, то на какое место (индекс) в массиве?
//Если нет, то на какой индекс его следует поставить?

import ArrayMethod.ArrayMethods;

public class RandomNumer {

    public static void main(String[] args){
        int[] numbers = new int [20];

        numbers =   ArrayMethods.fillArray(100,100,20);
        ArrayMethods.printArray(numbers);//print
        ArrayMethods.bubbleSort(numbers);//Sort
        ArrayMethods.printArray(numbers);//printcenm dnjv xnj jcn

        int index = ArrayMethods.binarySearch( numbers, 0);

        // index = (  index > 0) ? index : - index
        System.out.println(index);
    }
}

