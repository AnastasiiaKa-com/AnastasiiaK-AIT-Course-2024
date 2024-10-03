package Homework_10;//Заполнить массив четными числами от 0 до 50. 0, 2, 4, 8, ... , 42, 44, 48, 50
// Распечатать массив в порядке возрастания, затем в порядке убывания.

public class EvenNumbers {
    public static void main(String[] args) {
         int[] numbers =  new int [51];
        for (int i = 0; i <= 50; i++) {
            numbers[i] = i; //заполняем массив числами от 0 до 50
        }
  //печать массива в порядке возрастания
        System.out.print(" The array is in ascending order:");

        for ( int num : numbers ){

            System.out.print( num + " "); //выводим каждое число
        }
        System.out.println();
//печать массива в порядке убывания
        System.out.println(" Array in descending order:");
        for ( int i = numbers.length - 1; i >= 0; i--){

            System.out.print( i + " "); // вывлд числа

        }
    }
}
