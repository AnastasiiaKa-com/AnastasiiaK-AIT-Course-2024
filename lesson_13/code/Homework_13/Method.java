package Homework_13;
//Написать метод copyOfArray. Метод принимает на вход массив целых чисел и целое число - длину нового массива newLength. Метод должен создать новый массив длиной newLength. В новый массив должны быть скопированы элементы из входящего массива: Пример: Исходный массив:
//   {0, 1, 2, 3, 4 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
public class Method {

 //метод для копирования массива
    public static int [] copyOfArray ( int []original,int newLength){

        int [] newArray = new int[newLength];//новый массив с заданной длинной
        int elementsToCopy = Math.min(original.length,newLength);
         //копируем эл из оригинального массива в новый
        for (int i = 0; i < elementsToCopy; i++) {

            newArray[i] = original[i];//копируем эл по индексу
        }
        //возвращаем новый массив
        return newArray;

    }

    public static void main(String[] args) {

        int[] originalArray = {0,1,2,3,4,5};//исходный массив
        int newLength = 3;// длина нового
        int[] copiedArray = copyOfArray(originalArray,newLength);//копируем массив
        //печатаем новый
        System.out.println( " The copied array:");
        for ( int num : copiedArray){
            System.out.println(num + " ");
            //выврдим эл нового
        }
    }


}
