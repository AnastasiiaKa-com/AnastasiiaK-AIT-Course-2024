package Classwork_10;

//Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
//Найдите минимальный элемент массива и его индекс.
//Каков будет результат, если в массиве несколько одинаковых минимальных элементов?
//Найдите максимальный элемент массива и его индекс.
//Поменяйте местами минимальный и максимальный элементы, распечатайте массив.

public class Task1 {
    public static void main(String[] args) {
        int[] array = { 75, 34, -15, -123, 57, -145, 86, 77, -145, 48, -59, -145 };

        //               0    1   2    3    4    5    6   7    8   9    10

        int minOfArray = array [0] ;// предположение(guess)
        int indexOfMinElement = 0 ;// guess
        for (int i = 0; i <array.length; i++) {
            if(array[i]< minOfArray){

                minOfArray = array[i];
                indexOfMinElement = i;


            }

        }
        System.out.println("Min element of array = " + minOfArray + ", index of mine element= " + indexOfMinElement);

        int maxOfArray = array [0] ;// предположение(guess)
        int indexOfMaxElement = 0 ;// guess
        for (int i = 0; i <array.length; i++) {
            if(array[i]> minOfArray){

                maxOfArray = array[i];
                indexOfMaxElement = i;


            }

        }
        System.out.println("Max element of array = " + maxOfArray + ", index of max element= " + indexOfMaxElement);

        int temp = array[indexOfMinElement];
        array [indexOfMinElement] = array[indexOfMaxElement];
        array[indexOfMaxElement] = temp;

        System.out.println(array);
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array [i] + "");


        }
        System.out.println(); // NEXT LINE
    }

}
