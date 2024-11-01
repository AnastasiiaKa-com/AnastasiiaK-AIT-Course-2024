package Classwork_12.ArrayMethods;


////  - заполнение массива случайными целыми числами из интервала от a до b +
//  - печать массива целых чисел +
// - поиск элемента

public class ArrayMethods {
    // add percent
    public static double[] calculatePercent(double[] array, double percent){
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] *  (100 + percent)/100.0;
        }
        return array;
    }

    // print array double
    public static void printArrayDouble(double[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    // fill array random numbers
    // a - left border,b - rigcht border, n - quantiti

    public static int [] fillarray (int a, int b, int n){
        int[] res = new int [n];
        for (int i = 0; i < res.length ; i++) {
            res[i] = (int)(Math.random() * (b - a + 1) + a);

        }
        return res;


    }
    // print array
    public static void printArray( int [] array  ){

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------");
    }
    //search in array
    public static boolean searchInArray(int [] array,int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }// end of method

}// end of class









